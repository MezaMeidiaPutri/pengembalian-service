/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mezameidia.pengembalianservice.vo;

import com.mezameidia.pengembalianservice.Entity.Pengembalian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVo {
    private Pengembalian pengembalian;
    private Peminjaman peminjaman;
}
