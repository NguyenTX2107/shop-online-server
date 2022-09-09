package com.assignment.shoponline.repository;

import com.assignment.shoponline.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findAccountByUserName(String userName);

    List<Account> findAccountsByUserNameOrEmailOrPhone(String userName, String email, String phone);
}