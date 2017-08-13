package pl.pawelSz.foodEntities;

/**
 *
 * @author Paweł Szymaszek
 * @version 1.0
 * @since 13.08.2017
 *
 */
public class Foods {

    private int id;
    private String name;
    private String ScientificName;
    private String[] tags;

    public Foods() {
    }

    public Foods(int id, String name, String ScientificName, String[] tags) {
        this.id = id;
        this.name = name;
        this.ScientificName = ScientificName;
        this.tags = tags;
    }

    public String[] getTags() {
        return tags;
    }
    
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String ScientificName) {
        this.ScientificName = ScientificName;
    }

    @Override
    public String toString() {
        return "Foods{" + "id=" + id + ", name=" + name + ", ScientificName=" + ScientificName + '}';
    }

}
