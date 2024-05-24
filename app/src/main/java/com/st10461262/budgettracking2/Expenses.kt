package com.st10461262.budgettracking2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Expense(description: String, category: String, amount: Double) {
    fun equals() {}

}

class ExpenseAdapter(expenseActivity: ExpenseActivity, expenseList: ArrayList<Expense>) {
    fun notifyDataSetChanged() {
        TODO("Not yet implemented")
    }

}

private fun <AbsListView> AbsListView.setAdapter(expenseAdapter: ExpenseAdapter) {

}

private operator fun Double.plusAssign(equals: Unit) {
    TODO("Not yet implemented")
}

class ExpenseActivity : AppCompatActivity() {
    private var etExpenseDescription: EditText? = null
    private var spExpenseCategory: Spinner? = null
    private var etExpensesAmount: EditText? = null
    private var btnAddExpense: Button? = null
    private var tvTotalExpense: TextView? = null
    private var lvExpenseList: ListView? = null
    private val expenseList: ArrayList<Expense> = ArrayList<Expense>()
    private var expenseAdapter: ExpenseAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expenses)


        btnAddExpense?.setOnClickListener { // Handle add expense button click
            val description = etExpenseDescription?.getText().toString()
            val category = spExpenseCategory?.getSelectedItem().toString()
            val amount = etExpensesAmount?.getText().toString().toDouble()
            val expense = Expense(description, category, amount)
            expenseList.add(expense)
            expenseAdapter!!.notifyDataSetChanged()
            var totalExpense = 0.0
            for (e in expenseList) {
                totalExpense += e.equals()
            }
            tvTotalExpense?.setText("Total Expense: $" + String.format("%.2f", totalExpense))
        }
    }
}

