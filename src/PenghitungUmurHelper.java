/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.time.Period; 
/**
 *
 * @author 07rrk
 */
public class PenghitungUmurHelper {
 // Menghitung umur secara detail (tahun, bulan, hari)
public String hitungUmurDetail(LocalDate lahir, LocalDate sekarang) {
    Period period = Period.between(lahir, sekarang);
    return period.getYears() + " tahun, " + period.getMonths() + "bulan, " + period.getDays() + " hari";
}

// Menghitung hari ulang tahun berikutnya
public LocalDate hariUlangTahunBerikutnya(LocalDate lahir, LocalDate
sekarang) {
    LocalDate ulangTahunBerikutnya =
lahir.withYear(sekarang.getYear());
    if (!ulangTahunBerikutnya.isAfter(sekarang)) {
        ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
    }
    return ulangTahunBerikutnya;
}

// Menerjemahkan teks hari ke bahasa Indonesia
public String getDayOfWeekInIndonesian(LocalDate date) {
    switch (date.getDayOfWeek()) {
        case MONDAY:
            return "Senin";
        case TUESDAY:
            return "Selasa";
        case WEDNESDAY:
            return "Rabu";
        case THURSDAY:
            return "Kamis";
        case FRIDAY:
            return "Jumat";
        case SATURDAY:
            return "Sabtu";
        case SUNDAY:
            return "Minggu";
        default:
            return "";
    }
}
}
