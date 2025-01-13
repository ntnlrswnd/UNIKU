package com.project.uniku;

import java.util.ArrayList;

public class NotifData {
    private static String[]itemNotif ={
            "Bahasa Pemrograman 3",
            "Praktikum Bahasa Pemrograman 3",
            "Teknik Riset Otomasi"
    };

    private static String[] detailNotif = {
            "Tugas Membuat Design UI - Figma | 7 January 2025",
            "Project Akhir Praktikum - Membuat Aplikasi | 3 January 2025",
            "Membuat Materi Sesuai Yang Ditentukan - Kelompok | 1 January 2025"
    };

    static ArrayList<Notif> getListData() {
        ArrayList<Notif> list = new ArrayList<>();
        for (int position = 0; position < itemNotif.length; position++) {
            Notif notif = new Notif();
            notif.setNama(itemNotif[position]);
            notif.setDetail(detailNotif[position]);
            list.add(notif);
        }
        return list;  // Moved return statement outside of the loop
    }
}
