package com.secured.cbank.repository;

import com.secured.cbank.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findCardByCardNumber(String cardNumber);
    Card findCardByCardNumberAndPin(String cardNumber, String pin);
}
