package com.st10461262.budgettracking2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class activity_expenses : AppCompatActivity() {
    private var tvBalance: TextView? = null
    private var tvBalanceStatus: TextView? = null
    private var btnIncome: Button? = null
    private var btnExpense: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvBalance = findViewById(R.id.tvBalance)
        tvBalanceStatus = findViewById(R.id.tvBalanceStatus)
        btnIncome = findViewById(R.id.btnIncome)
        btnExpense = findViewById(R.id.btnExpense)


        }
    }
