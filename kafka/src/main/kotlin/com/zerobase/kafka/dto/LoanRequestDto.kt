package com.zerobase.kafka.dto

class LoanRequestDto(
    val userKey: String,
    val userName: String,
    val userIncomeAmount: Long,
    val userRegistrationNumber: String
)