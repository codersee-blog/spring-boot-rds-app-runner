package com.codersee.apprunnerrds.controller

import com.codersee.apprunnerrds.model.AppUser
import com.codersee.apprunnerrds.repository.AppUserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class AppUserController(
    private val appUserRepository: AppUserRepository
) {

    @GetMapping
    fun getAllUsers(): List<AppUser> =
        appUserRepository
            .findAll()
            .toList()

    @GetMapping("/non-db")
    fun getAllUsersNonDb(): List<AppUser> =
        listOf(
            AppUser(1L, "piotr@wolak.com")
        )
}