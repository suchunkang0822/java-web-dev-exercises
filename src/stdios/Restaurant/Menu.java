package stdios.Restaurant;
import java.util.*;
import java.time.LocalDateTime;


public class Menu {
    private HashMap <String, ArrayList<MenuItem>> menu = new HashMap<>();
    private String category[] = {"appetizer","mainCourse","dessert"};
    private ArrayList<MenuItem> appetizer = new ArrayList<>();
    private ArrayList<MenuItem> mainCourse= new ArrayList<>();
    private ArrayList<MenuItem> dessert= new ArrayList<>();


    private  LocalDateTime updated_time;
//    LocalDateTime date = LocalDateTime.now();

    public Menu(){
        menu.put("appetizer",appetizer);
        menu.put("mainCourse",mainCourse);
        menu.put("dessert",dessert);
    }

    private boolean menuCheck(MenuItem item){
        for(MenuItem itemInMenu: menu.get(item.getCategory())){
            if(item.equals(itemInMenu)){
                return true;
            }
        }
        return false;
    }


    private void addMenu(MenuItem item){

        if(item.getCategory().equals("appetizer")){
            if(!menuCheck(item)){
                appetizer.add(item);
            }else{
                System.out.println("the menu already exists");
            }
        } else if(item.getCategory().equals("mainCourse")){
            if(!menuCheck(item)){
                mainCourse.add(item);
            }else{
                System.out.println("the menu already exists");
            }
        } else if(item.getCategory().equals("dessert")){
            if(!menuCheck(item)){
                dessert.add(item);
            }else{
                System.out.println("the menu already exists");
            }
        }
        this.updated_time = LocalDateTime.now();

    }
    private void removeMenu(MenuItem item){
        int counter = 0;
        String item_category = item.getCategory();
        ArrayList<MenuItem> list = menu.get(item_category);
        for (MenuItem itemInArrayList : list) {
            if (item.equals(itemInArrayList)) {
                break;
//                list.remove(counter);
//                System.out.println("WWWHAT");
//                System.out.println(appetizer == null);
            }
            counter++;
        }
        list.remove(counter);
        updated_time = LocalDateTime.now();

    }

    public void print(){
        System.out.println("Menu");
        System.out.println("");
        for(String s : category){
            System.out.println(s+":"+"\n");
            for(MenuItem itemInMenu : menu.get(s)){
                System.out.println("*****");
                System.out.println(itemInMenu);
                System.out.println("*****"+"\n");
            }
        }
        System.out.println("Last updated: "+updated_time);
    }

    public void printLastUpdate(){
        System.out.println(updated_time);
    }

    public static void main(String[] args) {
        MenuItem salad = new MenuItem("salad","appetizer","Caesar Salad",9,true);
        MenuItem pizza = new MenuItem("pizza","mainCourse","Cheese Pizza",15,true);
        MenuItem pie = new MenuItem("pie","dessert","Apple pie",6,true);

        Menu ItalianKitchen = new Menu();

        ItalianKitchen.addMenu(salad);
        ItalianKitchen.addMenu(pizza);
        ItalianKitchen.addMenu(pie);

//        ItalianKitchen.print();

//        ItalianKitchen.menu.get("appetizer").remove(0);
        ItalianKitchen.removeMenu(salad);

        ItalianKitchen.print();

    }





}
