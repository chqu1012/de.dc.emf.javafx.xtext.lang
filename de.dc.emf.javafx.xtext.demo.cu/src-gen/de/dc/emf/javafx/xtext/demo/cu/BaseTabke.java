package de.dc.emf.javafx.xtext.demo.cu;

import de.dc.emf.javafx.xtext.demo.cu.feature.BaseContactCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.model.Contact;
import de.dc.emf.javafx.xtext.demo.cu.model.ContactType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseTabke extends BorderPane {
  private ObservableList<Contact> masterData = FXCollections.observableArrayList();
  
  private FilteredList<Contact> filteredMasterData = new FilteredList<>(masterData, p->true);
  
  private Map<ContactType, TableColumn<Contact, Contact>> columns = new HashMap<>();
  
  private TableView<Contact> tableView =  new TableView<Contact>();
  
  private TextField searchTextfield = new TextField();
  
  private HBox topPane = new HBox();
  
  private StringProperty searchProperty = new SimpleStringProperty("");
  
  private TableColumn<Contact, Contact> nameColumn;
  
  private ObjectProperty<Predicate<Contact>> nameFilter = new SimpleObjectProperty<>();
  
  private TableColumn<Contact, Contact> ageColumn;
  
  private ObjectProperty<Predicate<Contact>> ageFilter = new SimpleObjectProperty<>();
  
  private TableColumn<Contact, Contact> genderColumn;
  
  private ObjectProperty<Predicate<Contact>> genderFilter = new SimpleObjectProperty<>();
  
  private TableColumn<Contact, Contact> addressColumn;
  
  private ObjectProperty<Predicate<Contact>> addressFilter = new SimpleObjectProperty<>();
  
  public BaseTabke() {
    initTableView();
    initTopPane();
    
    setTop(topPane);
    setCenter(tableView);
  }
  
  public void initTableView() {
    nameColumn = createColumn(ContactType.Name.name(), Double.valueOf(300),  new BaseContactCellFeatures(ContactType.Name));
    ageColumn = createColumn(ContactType.Age.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Age));
    genderColumn = createColumn(ContactType.Gender.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Gender));
    addressColumn = createColumn(ContactType.Address.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Address));
    nameFilter.bind(Bindings.createObjectBinding(() -> 
                current -> String.valueOf(current.getName()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
                searchTextfield.textProperty()));
    ageFilter.bind(Bindings.createObjectBinding(() -> 
                current -> String.valueOf(current.getAge()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
                searchTextfield.textProperty()));
    genderFilter.bind(Bindings.createObjectBinding(() -> 
                current -> String.valueOf(current.getGender()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
                searchTextfield.textProperty()));
    addressFilter.bind(Bindings.createObjectBinding(() -> 
                current -> String.valueOf(current.getAddress()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
                searchTextfield.textProperty()));
    tableView.setItems(filteredMasterData);
    tableView.setOnKeyReleased(e ->{ 
    	if(getTop()==null) {
    		setTop(topPane);
    	}
    	searchProperty.set(searchProperty.get()+e.getText());
    });
    filteredMasterData.predicateProperty().bind(Bindings.createObjectBinding(()->nameFilter.get().or(ageFilter.get()).or(genderFilter.get()).or(addressFilter.get()), nameFilter,ageFilter,genderFilter,addressFilter));
  }
  
  public void initTopPane() {
    topPane.setSpacing(10d);
    topPane.setPadding(new Insets(5d));
    
    Label label = new Label("Search:");
    label.setMaxHeight(Double.MAX_VALUE);
    
    searchTextfield.setPromptText("Search for Contacts");
    searchTextfield.textProperty().bindBidirectional(searchProperty);
    
    Label filterLabel = new Label("Filter Result:");
    filterLabel.setMaxHeight(Double.MAX_VALUE);
    
    Label filterResultlabel = new Label("0");
    filterResultlabel.setMaxHeight(Double.MAX_VALUE);
    filterResultlabel.textProperty().bind(Bindings.size(filteredMasterData).asString());						
    Label emtyLabel = new Label("");
    emtyLabel.setMaxHeight(Double.MAX_VALUE);
    emtyLabel.setMaxWidth(Double.MAX_VALUE);
    HBox.setHgrow(emtyLabel, Priority.ALWAYS);
    
    Button closeButton = new Button("Close");
    closeButton.setOnAction(e -> {
    	setTop(null);
    	searchProperty.set("");
    });
    
    topPane.getChildren().addAll(label, searchTextfield, filterLabel, filterResultlabel, emtyLabel, closeButton);
  }
  
  protected TableColumn createColumn(final String name, final Double width, final Callback cellFeatures) {
    TableColumn<Contact, Contact> column = new TableColumn(name);
    column.setPrefWidth(width);
    column.setCellValueFactory(cellFeatures);
    columns.put(ContactType.valueOf(name), column);
    tableView.getColumns().add(column);		
    return column;	
  }
  
  public void setInput(final ObservableList<Contact> items) {
    masterData.clear();
    masterData.addAll(items);
  }
  
  public void setFeatureFor(final ContactType type, final Callback<TableColumn.CellDataFeatures<Contact, Contact>, ObservableValue<Contact>> feature) {
    columns.get(type).setCellValueFactory(feature);
  }
  
  public ObservableList<Contact> getMasterData() {
    return this.masterData;
  }
  
  public FilteredList<Contact> getFilteredMasterData() {
    return this.filteredMasterData;
  }
}
