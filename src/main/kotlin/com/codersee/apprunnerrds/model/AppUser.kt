package com.codersee.apprunnerrds.model

import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("app_user")
data class AppUser(
    @Column("id") val id: Long? = null,
    @Column("email") val email: String
)