package service;

import model.Expense;
import java.util.ArrayList;

public class ExpenseService {

    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void listExpenses() {
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void removeExpense(int id) {
        expenses.removeIf(e -> e.getId() == id);
    }
}
