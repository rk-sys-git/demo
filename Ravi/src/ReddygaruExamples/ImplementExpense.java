package ReddygaruExamples;

import ProductPkg.DeliveryServices;

import java.util.*;

public class ImplementExpense {
    public static void main(String[] args) {
        Expense expense = new Expense();
        expense.setExpenceId(1);
        expense.setExpenceName("rent");
        expense.setExpencePrice(8000);
        expense.setExpenceMonth("jan");

        Expense expense1 = new Expense();
        expense1.setExpenceId(2);
        expense1.setExpenceName("powerbill");
        expense1.setExpencePrice(3000);
        expense1.setExpenceMonth("jan");

        Expense expense2 = new Expense();
        expense2.setExpenceId(3);
        expense2.setExpenceName("grocery");
        expense2.setExpencePrice(5000);
        expense2.setExpenceMonth("jan");

        Expense expense3 = new Expense();
        expense3.setExpenceId(4);
        expense3.setExpenceName("loan");
        expense3.setExpencePrice(28000);
        expense3.setExpenceMonth("jan");

        Expense expense4 = new Expense();
        expense4.setExpenceId(5);
        expense4.setExpenceName("Entertainment");
        expense4.setExpencePrice(3000);
        expense4.setExpenceMonth("jan");

        Expense expense5 = new Expense();
        expense5.setExpenceId(1);
        expense5.setExpenceName("rent");
        expense5.setExpencePrice(8500);
        expense5.setExpenceMonth("feb");

        Expense expense6 = new Expense();
        expense6.setExpenceId(2);
        expense6.setExpenceName("powerbill");
        expense6.setExpencePrice(2000);
        expense6.setExpenceMonth("feb");

        Expense expense7 = new Expense();
        expense7.setExpenceId(3);
        expense7.setExpenceName("grocery");
        expense7.setExpencePrice(5110);
        expense7.setExpenceMonth("feb");

        Expense expense8 = new Expense();
        expense8.setExpenceId(4);
        expense8.setExpenceName("loan");
        expense8.setExpencePrice(29000);
        expense8.setExpenceMonth("feb");

        Expense expense9 = new Expense();
        expense9.setExpenceId(5);
        expense9.setExpenceName("Entertainment");
        expense9.setExpencePrice(3200);
        expense9.setExpenceMonth("feb");

        Expense expense10 = new Expense();
        expense10.setExpenceId(1);
        expense10.setExpenceName("rent");
        expense10.setExpencePrice(9000);
        expense10.setExpenceMonth("mar");

        Expense expense11 = new Expense();
        expense11.setExpenceId(2);
        expense11.setExpenceName("powerbill");
        expense11.setExpencePrice(3500);
        expense11.setExpenceMonth("mar");

        Expense expense12 = new Expense();
        expense12.setExpenceId(3);
        expense12.setExpenceName("grocery");
        expense12.setExpencePrice(4000);
        expense12.setExpenceMonth("mar");

        Expense expense13 = new Expense();
        expense13.setExpenceId(4);
        expense13.setExpenceName("loan");
        expense13.setExpencePrice(30000);
        expense13.setExpenceMonth("mar");

        Expense expense14 = new Expense();
        expense14.setExpenceId(5);
        expense14.setExpenceName("Entertainment");
        expense14.setExpencePrice(2700);
        expense14.setExpenceMonth("mar");

        Expense expense15 = new Expense();
        expense15.setExpenceId(1);
        expense15.setExpenceName("rent");
        expense15.setExpencePrice(8500);
        expense15.setExpenceMonth("april");

        Expense expense16 = new Expense();
        expense16.setExpenceId(2);
        expense16.setExpenceName("powerbill");
        expense16.setExpencePrice(3200);
        expense16.setExpenceMonth("april");

        Expense expense17 = new Expense();
        expense17.setExpenceId(3);
        expense17.setExpenceName("grocery");
        expense17.setExpencePrice(4500);
        expense17.setExpenceMonth("april");

        Expense expense18 = new Expense();
        expense18.setExpenceId(4);
        expense18.setExpenceName("loan");
        expense18.setExpencePrice(29000);
        expense18.setExpenceMonth("april");

        Expense expense19 = new Expense();
        expense19.setExpenceId(5);
        expense19.setExpenceName("Entertainment");
        expense19.setExpencePrice(2900);
        expense19.setExpenceMonth("april");

        Expense expense20 = new Expense();
        expense20.setExpenceId(1);
        expense20.setExpenceName("rent");
        expense20.setExpencePrice(9500);
        expense20.setExpenceMonth("may");

        Expense expense21 = new Expense();
        expense21.setExpenceId(2);
        expense21.setExpenceName("powerbill");
        expense21.setExpencePrice(3200);
        expense21.setExpenceMonth("may");

        Expense expense22 = new Expense();
        expense22.setExpenceId(3);
        expense22.setExpenceName("grocery");
        expense22.setExpencePrice(6000);
        expense22.setExpenceMonth("may");

        Expense expense23 = new Expense();
        expense23.setExpenceId(4);
        expense23.setExpenceName("loan");
        expense23.setExpencePrice(29000);
        expense23.setExpenceMonth("may");

        Expense expense24 = new Expense();
        expense24.setExpenceId(5);
        expense24.setExpenceName("Entertainment");
        expense24.setExpencePrice(1900);
        expense24.setExpenceMonth("may");

        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(expense);
        expenseList.add(expense1);
        expenseList.add(expense2);
        expenseList.add(expense3);
        expenseList.add(expense4);
        expenseList.add(expense5);
        expenseList.add(expense6);
        expenseList.add(expense7);
        expenseList.add(expense8);
        expenseList.add(expense9);
        expenseList.add(expense10);
        expenseList.add(expense11);
        expenseList.add(expense12);
        expenseList.add(expense13);
        expenseList.add(expense14);
        expenseList.add(expense15);
        expenseList.add(expense16);
        expenseList.add(expense17);
        expenseList.add(expense18);
        expenseList.add(expense19);
        expenseList.add(expense20);
        expenseList.add(expense21);
        expenseList.add(expense22);
        expenseList.add(expense23);
        expenseList.add(expense24);

        Map<String, List<Expense>> m1 = new HashMap<>();
        for (Expense exp : expenseList) {
            if (m1.containsKey(exp.getExpenceMonth())) {
                List<Expense> expenseList2 = m1.get(exp.getExpenceMonth());
                expenseList2.add(exp);

            } else {
                List<Expense> expenseList1 = new ArrayList<>();
                expenseList1.add(exp);
                m1.put(exp.getExpenceMonth(), expenseList1);
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.println("enter month");
        String mon = s.nextLine();

        List<Expense> list = m1.get(mon);
        int totalExpence=0;
        for (Expense er : list) {
            System.out.println("---------------------------------------");

            totalExpence= totalExpence + er.getExpencePrice();

            System.out.println("expence id"+er.getExpenceId());
            System.out.println("expence name"+er.getExpenceName());
            System.out.println("expence price"+er.getExpencePrice());
            System.out.println("expence month"+er.getExpenceMonth());

        }
        System.out.println("total"+totalExpence);
    }
}
