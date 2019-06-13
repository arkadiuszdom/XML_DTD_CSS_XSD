package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.xml.sax.SAXException;
import sun.org.mozilla.javascript.internal.xml.XMLLib;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;
import java.util.List;

public class Main extends Application implements EventHandler<ActionEvent> {
    private RankingGenreSummary rankingGenreSummary;
    private Stage window;
    private TextField newPositionsTableDataTitleTextField;
    private TextField editPositionsTableDataTitleTextField1;
    private TextField editPositionsTableDataTitleTextField2;
    private TextField deletePositionsTableDataTitleTextField;
    private Button newPositionsTableDataTitleButton;
    private Button editPositionsTableDataTitleButton;
    private Button deletePositionsTableDataTitleButton;
    private Button generateFileButton;
    private ChoiceBox generateChoiceBox;
    private ChoiceBox genresChoiceBox;
    @Override
    public void handle(ActionEvent event)
    {
        try {
            if( generateFileButton == event.getSource() ) {
                this.transform(this.generateChoiceBox.getValue().toString());
                //this.writeRankingGenreSummaryToXml(this.rankingGenreSummary);
            } else {
                String genreText = this.genresChoiceBox.getValue().toString();
                if (newPositionsTableDataTitleButton == event.getSource()) {
                    String titleText = this.newPositionsTableDataTitleTextField.getText();
                    this.rankingGenreSummary.addPositionsTableDataTitle(titleText, genreText);
                } else if (editPositionsTableDataTitleButton == event.getSource()) {
                    String titleTextOld = this.editPositionsTableDataTitleTextField1.getText();
                    String titleTextNew = this.editPositionsTableDataTitleTextField2.getText();
                    this.rankingGenreSummary.editPositionsTableDataTitle(titleTextOld, titleTextNew, genreText);
                } else if (deletePositionsTableDataTitleButton == event.getSource()) {
                    String titleText = this.deletePositionsTableDataTitleTextField.getText();
                    this.rankingGenreSummary.deletePositionsTableDataTitle(titleText, genreText);
                }
                this.showStage(this.window);
            }
        } catch(Exception e) {

        }

    }

    private void showStage(Stage stage) {
        int rowCounter=0;

        int positionsTableDataGenreColumnNumber=0;
        int positionsTableDataTitleTextColumnNumber=1;

        int genresChoiceBoxColumnNumber=1;
        int positionsTableDataTitleTextFieldColumnNumber = 0;
        int editPositionsTableDataTitleTextFieldColumnNumber = 1;
        int positionsTableDataTitleButtonColumnNumber = 1;
        int editPositionsTableDataTitleButtonColumnNumber = 2;

        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        this.genresChoiceBox = new ChoiceBox();
        rowCounter++;


        this.newPositionsTableDataTitleTextField = new TextField();
        gridPane.add(this.newPositionsTableDataTitleTextField,positionsTableDataTitleTextFieldColumnNumber,rowCounter);
        newPositionsTableDataTitleButton = new Button("New title");
        newPositionsTableDataTitleButton.setOnAction(this);
        gridPane.add(newPositionsTableDataTitleButton,positionsTableDataTitleButtonColumnNumber,rowCounter);
        rowCounter++;

        this.editPositionsTableDataTitleTextField1 = new TextField();
        gridPane.add(this.editPositionsTableDataTitleTextField1,positionsTableDataTitleTextFieldColumnNumber,rowCounter);
        this.editPositionsTableDataTitleTextField2 = new TextField();
        gridPane.add(this.editPositionsTableDataTitleTextField2,editPositionsTableDataTitleTextFieldColumnNumber,rowCounter);
        editPositionsTableDataTitleButton = new Button("Edit title");
        editPositionsTableDataTitleButton.setOnAction(this);
        gridPane.add(editPositionsTableDataTitleButton,editPositionsTableDataTitleButtonColumnNumber,rowCounter);
        rowCounter++;

        this.deletePositionsTableDataTitleTextField = new TextField();
        gridPane.add(this.deletePositionsTableDataTitleTextField,positionsTableDataTitleTextFieldColumnNumber,rowCounter);
        deletePositionsTableDataTitleButton = new Button("Delete title");
        deletePositionsTableDataTitleButton.setOnAction(this);
        gridPane.add(deletePositionsTableDataTitleButton,positionsTableDataTitleButtonColumnNumber,rowCounter);
        rowCounter++;




        RankingGenreSummary.PositionsTable positionsTable = rankingGenreSummary.getPositionsTable();
        List<RankingGenreSummary.PositionsTable.PositionsTableDataRow> positionsTableDataRows = positionsTable.getPositionsTableDataRow();

        for (int i = 0; i < positionsTableDataRows.size(); i++) {
            RankingGenreSummary.PositionsTable.PositionsTableDataRow positionsTableDataRow = positionsTableDataRows.get(i);
            String positionsTableDataGenre = positionsTableDataRow.getPositionsTableDataGenre();
            Text positionsTableDataGenreText = new Text(positionsTableDataGenre);

            genresChoiceBox.getItems().add(i,positionsTableDataGenre);

            gridPane.add(positionsTableDataGenreText, positionsTableDataGenreColumnNumber, rowCounter);
            rowCounter++;

            RankingGenreSummary.PositionsTable.PositionsTableDataRow.PositionsTableDataTitles positionsTableDataTitlesElement = positionsTableDataRow.getPositionsTableDataTitles();
            List<String> positionsTableDataTitles = positionsTableDataTitlesElement.getPositionsTableDataTitle();
            for (int j = 0; j < positionsTableDataTitles.size(); j++) {
                String positionsTableDataTitle = positionsTableDataTitles.get(j);
                Text positionsTableDataTitleText = new Text(positionsTableDataTitle);
                gridPane.add(positionsTableDataTitleText, positionsTableDataTitleTextColumnNumber, rowCounter);
                rowCounter++;
            }
        }

        gridPane.add(genresChoiceBox,genresChoiceBoxColumnNumber,0);

        this.generateFileButton = new Button("Create file");
        this.generateFileButton.setOnAction(this);
        gridPane.add(this.generateFileButton, 1, rowCounter);

        this.generateChoiceBox = new ChoiceBox();
        this.generateChoiceBox.getItems().addAll("xhtml", "svg");
        gridPane.add(this.generateChoiceBox, 0, rowCounter);


        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);
        //Setting title to the Stage
        stage.setTitle("Arkadiusz Domrat i Krzysztof Gonicki");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    @Override
    public void start(Stage stage) throws JAXBException, SAXException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose XML file");
        File file = fileChooser.showOpenDialog(stage);

        this.rankingGenreSummary = readRankingGenreSummaryFromXml(file);
        this.window = stage;
        this.showStage(stage);



    }
    public static void main(String args[]){
        launch(args);
    }
    public RankingGenreSummary readRankingGenreSummaryFromXml(File xmlFile) throws JAXBException, SAXException {
        JAXBContext jaxbContext;
        RankingGenreSummary positionsTableDataTitles = null;
        try
        {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("ranking5.xsd"));
            jaxbContext = JAXBContext.newInstance(RankingGenreSummary.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            jaxbUnmarshaller.setSchema(schema);
            positionsTableDataTitles = (RankingGenreSummary) jaxbUnmarshaller.unmarshal(xmlFile);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e){
            e.printStackTrace();
        }
        return positionsTableDataTitles;
    }

    public void writeRankingGenreSummaryToXml(RankingGenreSummary rankingGenreSummary) throws JAXBException, SAXException {
        JAXBContext jaxbContext;
        try
        {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("ranking5.xsd"));
            jaxbContext = JAXBContext.newInstance(RankingGenreSummary.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setSchema(schema);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("new_ranking5.xml"), "UTF-8");
            jaxbMarshaller.marshal(rankingGenreSummary, outputStreamWriter);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void transform(String type) throws JAXBException, TransformerException {
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance(RankingGenreSummary.class);

        JAXBSource source = new JAXBSource( jaxbContext, this.rankingGenreSummary );

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(type.concat(".xslt")));

        transformer.transform(source,new StreamResult(new File("ranking.".concat(type))));
    }
}
