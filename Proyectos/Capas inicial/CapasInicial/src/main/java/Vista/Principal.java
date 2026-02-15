/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Empresa;
import Modelo.EmpresaDAO;
import java.util.HashSet;

/**
 *
 * @author Soporte
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código para ingresar datos
        Empresa empresa = new Empresa("Universidad Urbana");
        System.out.println(empresa.toString());
        EmpresaDAO empresadao = new EmpresaDAO();
        
        //empresadao.insert(empresa);
        
        
        
        // Código para update
        //empresa.setCodigoEmpresa(6);
        //empresa.setNombreEmpresa("Universidad Harvard");
        //int n;
        //n = empresadao.update(empresa);
        
        //System.out.println(empresa.toString());
        
        //Código para delete
        empresa.setCodigoEmpresa(6);
        empresa.setNombreEmpresa("Universidad Harvard");
        int n;
        n = empresadao.delete(empresa);
        
        System.out.println(empresa.toString());
    }
    
}
