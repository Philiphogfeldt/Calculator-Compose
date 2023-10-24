package com.example.calculator

sealed class CalculatedAction{
    data class Number (val number: Int): CalculatedAction()
    object Clear: CalculatedAction()
    object Delete: CalculatedAction()
    object Decimal: CalculatedAction()
    object Calculate: CalculatedAction()
    data class Operation(val operation: CalculatorOperation): CalculatedAction()
}
