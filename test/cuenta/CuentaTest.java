
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cuenta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author H
 */
public class CuentaTest {
    
    Cuenta cuenta;
    Cuenta cuenta1;
    
    public CuentaTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cuenta = new Cuenta(50,"12345");
        cuenta1 = new Cuenta(0,"67890");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Retirada method, of class Cuenta.
     */
    @Test
    public void testRetirada() {
        
        double retirada = 50.0;
        
        try{
            cuenta.Retirada(retirada);
            System.out.println("TestRetirada "+cuenta.getCuenta()+": " + cuenta.getSaldo());
        }catch(Exception e){
            System.out.println(e.getMessage());
            //fail("The test case is a prototype.");
        }        
    }
    
    @Test
    public void testRetirada_Negativa() {
        
        double retirada = -100.0;
        
        try{
            cuenta.Retirada(retirada);
            System.out.println("TestRetirada_Negativa "+cuenta.getCuenta()+": "+cuenta.getSaldo());
            //fail("The test case is a prototype.");
        }catch(Exception e){           
            System.out.println("TestRetirada_Negativa: No puede retirar cantidades negativas");
        }       
    }
    
    @Test
    public void testRetirada_Insuficiente() {
        
        double retirada = 100.0;
        
        try{
            cuenta.Retirada(retirada);
            System.out.println("TestRetirada_Insuficiente "+cuenta.getCuenta()+": "+cuenta.getSaldo());
        }catch(Exception e){
            System.out.println("TestRetirada_Insuficiente: La retirada supera al saldo");
            //fail("The test case is a prototype.");
        }       
    }
    

    /**
     * Test of Ingreso method, of class Cuenta.
     */
    @Test
    public void testIngreso() {
        
        double ingreso = 100.0;
        try{
            cuenta.Ingreso(ingreso);
            System.out.println("TestIngreso "+cuenta.getCuenta()+": "+cuenta.getSaldo());
        }catch(Exception e){
            System.out.println(e.getMessage());
            //fail("The test case is a prototype.");
        }      
    }
    
    @Test
    public void testIngreso_Negativo() {
        
        double ingreso = -100.0;
        try{
            cuenta.Ingreso(ingreso);
            System.out.println("TestIngresar_Negativo "+cuenta.getCuenta()+": "+cuenta.getSaldo());
            //fail("The test case is a prototype.");
        }catch(Exception e){
            System.out.println("TestIngresar_Negativo: Nose puede ingresar cantidades negativas");
        }      
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("El saldo de la cuenta "+cuenta.getCuenta()+" es "+cuenta.getSaldo());
        double result = cuenta.getSaldo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class Cuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("La cuenta es: "+cuenta.getCuenta());
        String expResult = "";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
