package com.st10461262.budgettracking2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var tvBalance: TextView? = null
    private var tvBalanceStatus: TextView? = null
    private var btnIncome: Button? = null
    private var btnExpense: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvBalance = findViewById(R.id.tvBalance)
        tvBalanceStatus = findViewById(R.id.tvBalanceStatus)


        val balance = 100000
        val expenses = 50000
        val income = 1500

        // Set on-click Listeners for the buttons
        btnIncome?.setOnClickListener { openIncomeScreen() }
        btnExpense?.setOnClickListener { openExpenseActivity() }
    }


    fun openIncomeScreen() {
        StartActivity(Intent( this, IncomeScreen::class.java))

    }

    fun openExpenseActivity() {
        StartActivity(Intent( this, ExpenseScreen::class.java))
    }

    class ExpenseScreen {

    }

}

class IncomeScreen {

}

class StartActivity(intent: Intent) {

}
