//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        int winterCost = 1000; //will be input by user at a later date
        int springCost = 750; //will be input by user at a later date
        int summerCost = 1250; //will be input by user at a later date
        int fallCost = 1150; //will be input by user at a later date
        int totalCost; //all costs added together

        totalCost = winterCost+springCost+summerCost+fallCost;
        System.out.println("Your total yearly cost is $"+totalCost+"!");
    }
}