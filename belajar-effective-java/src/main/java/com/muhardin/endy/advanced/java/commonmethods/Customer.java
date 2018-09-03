package com.muhardin.endy.advanced.java.commonmethods;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@EqualsAndHashCode(of = {"id", "nomor"})
@AllArgsConstructor @NoArgsConstructor
public class Customer implements Serializable {
    private String id;
    private String nomor;
    private String nama;
    private String email;
}
