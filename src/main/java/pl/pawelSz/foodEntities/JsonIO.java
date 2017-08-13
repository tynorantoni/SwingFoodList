package pl.pawelSz.foodEntities;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paweł Szymaszek
 * @version 1.0
 * @since 13.08.2017
 *
 */
public class JsonIO {

    File fileT = new File("Files\\tags.txt");
    File fileF = new File("Files\\foods.txt");
    String fileTag = fileT.getAbsolutePath();
    String fileFood = fileF.getAbsolutePath();

    /*
    Creates new tag
    @param tag - string from swing application
    @return tag object
     */
    private Tags createNewTag(String tag) {

        Tags tags = new Tags();
        tags.setTag(tag);
        return tags;
    }

    /**
     * Creates new food item
     *
     * @param id next number given by swing app
     * @param name name of food item
     * @param scientificName Scientific food name
     * @param tags Array of tags
     * @return food object
     */
    private Foods createNewFood(int id, String name, String scientificName, String[] tags) {
        Foods food = new Foods();

        food.setId(id);
        food.setName(name);
        food.setScientificName(scientificName);
        food.setTags(tags);
        return food;
    }

    /**
     * This method writes to Json file a Json object from createNewTag method
     *
     * @param tags object from createNewTag method
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public void writeTag(String tags) {

        ObjectMapper mapper = new ObjectMapper();
        Tags tag = createNewTag(tags);
        try {
            String sTag = mapper.writeValueAsString(tag);
            Files.write(new File(fileTag).toPath(), Arrays.asList(sTag), StandardOpenOption.APPEND);
        } catch (JsonGenerationException e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        } catch (JsonMappingException e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Silly method, deletes and creates new Json file
     *
     * @throws IOException
     *
     */
    public void refreshTag() {
        try {
            Files.delete(new File(fileTag).toPath());
            Files.createFile(new File(fileTag).toPath());
        } catch (IOException ex) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Silly method, deletes and creates new Json file
     *
     * @throws IOException
     *
     */
    public void refreshFood() {
        try {
            Files.delete(new File(fileFood).toPath());
            Files.createFile(new File(fileFood).toPath());
        } catch (IOException ex) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method writes to Json file a Json object from createNewFood method
     *
     * @param id next number given by swing app
     * @param name name of food item
     * @param scientificName Scientific food name
     * @param tags Array of tags
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public void writeFood(int id, String name, String scientificName, String[] tags) {

        ObjectMapper mapper = new ObjectMapper();
        Foods food = createNewFood(id, name, scientificName, tags);
        try {
            String sFood = mapper.writeValueAsString(food);
            Files.write(new File(fileFood).toPath(), Arrays.asList(sFood), StandardOpenOption.APPEND);
        } catch (JsonGenerationException e) {
             Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        } catch (JsonMappingException e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
             Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);;
        }
    }

    /**
     * This method is used to read values from json file
     *
     * @return ArrayList containing objects of Foods class
     * @throws IOException
     */
    public List<Foods> readFoods() {
        List<Foods> foodList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileFood)) {
            JsonFactory jf = new JsonFactory();
            JsonParser jp = jf.createParser(fis);
            jp.setCodec(new ObjectMapper());
            jp.nextToken();
            while (jp.hasCurrentToken()) {
                Foods food = jp.readValueAs(Foods.class);
                jp.nextToken();

                for (Foods string : Arrays.asList(food)) {
                    foodList.add(food);

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return foodList;
    }

    /**
     * This method is used to read values from json file
     *
     * @return ArrayList containing objects of Tags class
     * @throws IOException
     */
    public List<String> readTags() {

        List<String> tagList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileTag)) {
            JsonFactory jf = new JsonFactory();
            JsonParser jp = jf.createParser(fis);
            jp.setCodec(new ObjectMapper());
            jp.nextToken();
            while (jp.hasCurrentToken()) {
                Tags tags = jp.readValueAs(Tags.class);
                jp.nextToken();

                for (Tags string : Arrays.asList(tags)) {

                    tagList.add(string.getTag());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tagList;

    }

}
