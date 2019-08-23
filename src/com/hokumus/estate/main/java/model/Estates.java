package com.hokumus.estate.main.java.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estates")
public class Estates extends BaseEntity {

	private Long id;
	private String name;
	private String discription;
	private HouseType houseType;
	private String address;
	private RoomType roomType;
	private String frontInf;
	private Integer floor;
	private Integer size;
	private float price;
	private EstateTypes estateType;
	private District district;
	private Member member;
	private byte[] image;
	private String imagePath;
	

	@Id
	@SequenceGenerator(name = "sq_estates", sequenceName = "sq_estates")
	@GeneratedValue(generator = "sq_estates", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Enumerated
	@JoinColumn(name = "housetypeid")
	public HouseType getHouseType() {
		return houseType;
	}

	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@ManyToOne
	@JoinColumn(name = "roomtypeid")
	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public String getFrontInf() {
		return frontInf;
	}

	public void setFrontInf(String frontInf) {
		this.frontInf = frontInf;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@ManyToOne
	@JoinColumn(name = "estatetypeid")
	public EstateTypes getEstateType() {
		return estateType;
	}

	public void setEstateType(EstateTypes estateType) {
		this.estateType = estateType;
	}

	@ManyToOne
	@JoinColumn(name = "districtid")
	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@ManyToOne
	@JoinColumn(name = "")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
