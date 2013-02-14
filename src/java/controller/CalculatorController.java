/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalculatorService;
import model.ITaxCalculatorService;
import model.ITipCalculatorService;
import model.ITotalCalculatorService;
import model.MenuItems;
import model.Receipt;

/**
 *
 * @author scottodya
 */
public class CalculatorController extends HttpServlet {
    private static final String DESTINATION = "result.jsp";
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // parameters are name attributes in view pages
        // Here we're retrieving form content from form.html
        String[] aItemName = request.getParameterValues("menuItems");
        
        Receipt r = new Receipt();
        
//        double preTotal = 0;
//        for (String item : aItemName) {
//            MenuItems menuItem = null;
//            if (menuItem.getItemName().equals(item)){
//                preTotal =+ menuItem.getItemPrice();
//            }
//        }
//        
//        ITaxCalculatorService iTax = new CalculatorService();
//        ITipCalculatorService iTip = new CalculatorService();
//        ITotalCalculatorService iTotal = new CalculatorService();
        
        r.setOrderItemPrices(aItemName);
        double resultTax = r.getTax();
        double resultTip = r.getTip();
        double resultTotal = r.getTotal();

        request.setAttribute("answer_Tax", resultTax);
        request.setAttribute("answer_Tip", resultTip);
        request.setAttribute("answer_Total", resultTotal);
        
        // This object lets you forward both the request and response
        // objects to a destination page
        
//        RequestDispatcher rd = getServletContext().getRequestDispatcher(DESTINATION);
//            rd.forward(request, response);
        
        RequestDispatcher view =
                request.getRequestDispatcher(DESTINATION);
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
