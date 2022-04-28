package com.importcsvfiles.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "camera")
public class Tutorial {
    @Id
    @GeneratedValue(generator = "cam_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "cam_gen",sequenceName = "cam_seq",initialValue = 10,allocationSize = 1)
    private Integer cameraId;
    @Column(length = 40)
    private String model;
    @Column(length = 40)
    private String brand; //CANON,SONY,NIKON,PANASONIC,FUJIYAMA
    @Column(length = 40)
    private String cameraType; //DSLR,SLR,POINT N SHOOT, MIRRORLESS
    @Column(length = 40)
    private String lensType; // TELEPHOTO,ZOOM,WIDE ANGLE,PRIME,FISH EYE
    private double price;

    public Tutorial(String model, String brand, String cameraType, String lensType, double price) {
        this.model = model;
        this.brand = brand;
        this.cameraType = cameraType;
        this.lensType = lensType;
        this.price = price;
    }
}
