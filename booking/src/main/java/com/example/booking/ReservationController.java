package com.example.booking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private static final Logger log = LoggerFactory.getLogger(ReservationController.class);

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(
            @PathVariable("id") Long id
    ) {
        return ResponseEntity.ok(reservationService.getReservationByID(id));
    }

    @GetMapping()
    public ResponseEntity<List<Reservation>> getAllReservation() {
        log.info("Called getAllReservations");
        return ResponseEntity.ok(reservationService.findAllReservation());
    }

    @PostMapping("/create")
    public ResponseEntity<Reservation> createReservation(
            @RequestBody Reservation createReservation
    ) {
        log.info("Created");
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Test-header", "123")
                .body(reservationService.createReservation(createReservation));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(
            @PathVariable("id") Long id,
            @RequestBody Reservation reservationToUpdate
    ){
        log.info("Called updateReservation");
        var updated = reservationService.updateReservation(id, reservationToUpdate);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reservation> deleteReservation(
            @PathVariable("id") Long id
    ) {
        log.info("Delete reservation");
        try {
            reservationService.deleteReservation(id);
            return ResponseEntity.ok().build();
        }catch (NoSuchElementException e) {
            return ResponseEntity.status(404).build();
        }
    }

    @PostMapping("/{id}/approve")
    public ResponseEntity<Reservation> approveReservation(
            @PathVariable("id") Long id
    ) {
        log.info("Called approveReservation");
        var reservation = reservationService.approveReservation(id);
        return ResponseEntity.ok(reservation);
    }
}
