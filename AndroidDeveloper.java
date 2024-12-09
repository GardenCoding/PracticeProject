/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

/**
 *
 * @author galax
 */
public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 6000;
    }

    @Override
    public String name() {
        return "AndroidDeveloper";
    }    
}
