/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pawelSz.foodEntities;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paweł Szymaszek
 * @version 1.0
 * @since 13.08.2017
 *
 */
public class JsonIOTest {

    File fileT = new File("src\\test\\testFiles\\tags.txt");
    File fileF = new File("src\\test\\testFiles\\foods.txt");
    String fileTag = fileT.getAbsolutePath();
    String fileFood = fileF.getAbsolutePath();

    public JsonIOTest() {
    }

    public Tags createNewTagTest(String tag) {

        Tags tags = new Tags();
        tags.setTag(tag);
        return tags;
    }

    public Foods createNewFoodTest(int id, String name, String scientificName, String[] tags) {
        Foods food = new Foods();

        food.setId(id);
        food.setName(name);
        food.setScientificName(scientificName);
        food.setTags(tags);
        return food;
    }

    /**
     * Test of writeTag method, of class JsonIO.
     */
    @Test
    public void testWriteTag() {
        System.out.println("writeTag");
        String tags = "TestTag";

        ObjectMapper mapper = new ObjectMapper();
        Tags tag = createNewTagTest(tags);
        try {
            String sTag = mapper.writeValueAsString(tag);
            assertEquals("Tag Written", "{\"tag\":\"TestTag\"}", mapper.writeValueAsString(tag));
        } catch (JsonProcessingException ex) {
            Logger.getLogger(JsonIOTest.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * Test of refreshTag method, of class JsonIO.
     */
    @Test
    public void testRefreshTag() {
        System.out.println("refreshTag");
        boolean isThereAnyFIle = false;
        JsonIO instance = new JsonIO();
        instance.refreshTag();
        isThereAnyFIle = fileT.exists();
        assertTrue("File Created", isThereAnyFIle);
    }

    /**
     * Test of refreshFood method, of class JsonIO.
     */
    @Test
    public void testRefreshFood() {
        System.out.println("refreshFood");
        boolean isThereAnyFIle = false;
        JsonIO instance = new JsonIO();
        instance.refreshFood();
        isThereAnyFIle = fileF.exists();
        assertTrue("File Created", isThereAnyFIle);
    }

    /**
     * Test of writeFood method, of class JsonIO.
     */
    @Test
    public void testWriteFood() {
        System.out.println("writeFood");
        int id = 0;
        String name = "TestName";
        String scientificName = "TestScName";
        String[] tags = new String[]{"tag1", "tag2", "tag3"};
        ObjectMapper mapper = new ObjectMapper();
        Foods food = createNewFoodTest(id, name, scientificName, tags);
        try {
            String sFood = mapper.writeValueAsString(food);
            assertEquals("Food Written", "{\"id\":0,\"name\":\"TestName\",\"tags\":[\"tag1\",\"tag2\",\"tag3\"],\"scientificName\":\"TestScName\"}", mapper.writeValueAsString(food));
        } catch (JsonProcessingException ex) {
            Logger.getLogger(JsonIOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of readFoods method, of class JsonIO.
     */
    @Test
    public void testReadFoods() {
        System.out.println("readFoods");
        int id = 0;
        String name = "";
        String scientificName = "";
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
                    foodList.add(string);
                    name = foodList.get(0).getName();
                    id = foodList.get(0).getId();
                    scientificName = foodList.get(0).getScientificName();
                }
            }
            assertEquals("Id", 1, id);
            assertEquals("Name", "TestName", name);
            assertEquals("ScientificName", "TestScName", scientificName);
        } catch (IOException ex) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Test of readTags method, of class JsonIO.
     */
    @Test
    public void testReadTags() {
        System.out.println("readTags");
        String tag = "";
        JsonIO instance = new JsonIO();
        List<String> expResult = null;
        List<String> result = instance.readTags();
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
                    tag = tagList.get(0);
                }
            }
            assertEquals("Tag", "TestTag", tag);
            
        } catch (IOException ex) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
