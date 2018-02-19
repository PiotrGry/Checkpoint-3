package Controller;


import dao.BookDao;
import view.View;

import java.sql.SQLException;

public class RootController {
    View view = new View();
    BookDao bookDao = new BookDao();

    public void run(){
        int option;
        boolean programIsWorking = true;
        while(programIsWorking){
            view.showMenu();
           option =  view.getNumberFromUser("Enetr Option: ");
            switch(option){
                case 1:
                    try {
                        System.out.println(bookDao.showAllBooks().iterator().next().toString());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }


            }




        }


    }

}
