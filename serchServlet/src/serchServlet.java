/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.io.*;

public class serchServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String ch = req.getParameter("ch");
        
        BookDAOImpl dao = new BookDAOImpl(ConnectionProvider.getConnection());
        List<bookDtls> blist = dao.getBookBySearch(ch);
        
        HttpSession session = req.getSession();
        if(blist != null){
            session.setAttribute("bookList", blist);
            resp.sendRedirect("search_book.jsp");
        }else{
            session.setAttribute("msg", "Item is not available");
            resp.sendRedirect("search_book.jsp");
        }
    }
}
