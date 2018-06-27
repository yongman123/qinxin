package com.liu.entity;

/**
 * @author 刘伟 产品实体
 */
public class Product {
	private String id; // 商品ID
	private String name; // 商品名称
	private String image; // 商品主图
	private String detail; // 商品详情
	private String sname; // 店铺名称
	private float price; // 商品价格
	private int sales; // 商品月销量
	private float percent; // 收入比例（%）
	private float commission;// 佣金
	private String wangwang; // 卖家旺旺
	private String tbksurl; // 淘宝客短链接
	private String tbkurl; // 淘宝客链接
	private String taokouling; // 淘口令
	private int couponsnum; // 优惠券数量
	private int couponsonlynum; // 优惠券剩余数量
	private String couponsprice; // 优惠券面额
	private String begintime; // 优惠券开始时间
	private String endtime; // 优惠券结束时间
	private String couponsonurl; // 优惠券链接
	private String qtkl; // 优惠券淘口令
	private String couponsonsurl; // 优惠券短链接
	private String yxjh; // 是否为营销计划

	public Product() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	public String getWangwang() {
		return wangwang;
	}

	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

	public String getTbksurl() {
		return tbksurl;
	}

	public void setTbksurl(String tbksurl) {
		this.tbksurl = tbksurl;
	}

	public String getTbkurl() {
		return tbkurl;
	}

	public void setTbkurl(String tbkurl) {
		this.tbkurl = tbkurl;
	}

	public String getTaokouling() {
		return taokouling;
	}

	public void setTaokouling(String taokouling) {
		this.taokouling = taokouling;
	}

	public int getCouponsnum() {
		return couponsnum;
	}

	public void setCouponsnum(int couponsnum) {
		this.couponsnum = couponsnum;
	}

	public int getCouponsonlynum() {
		return couponsonlynum;
	}

	public void setCouponsonlynum(int couponsonlynum) {
		this.couponsonlynum = couponsonlynum;
	}

	public String getCouponsprice() {
		return couponsprice;
	}

	public void setCouponsprice(String couponsprice) {
		this.couponsprice = couponsprice;
	}

	
	public String getBegintime() {
		return begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getCouponsonurl() {
		return couponsonurl;
	}

	public void setCouponsonurl(String couponsonurl) {
		this.couponsonurl = couponsonurl;
	}

	public String getQtkl() {
		return qtkl;
	}

	public void setQtkl(String qtkl) {
		this.qtkl = qtkl;
	}

	public String getCouponsonsurl() {
		return couponsonsurl;
	}

	public void setCouponsonsurl(String couponsonsurl) {
		this.couponsonsurl = couponsonsurl;
	}

	public String getYxjh() {
		return yxjh;
	}

	public void setYxjh(String yxjh) {
		this.yxjh = yxjh;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", image=" + image + ", detail=" + detail + ", sname=" + sname + ", price=" + price + ", sales=" + sales + ", percent=" + percent
				+ ", commission=" + commission + ", wangwang=" + wangwang + ", tbksurl=" + tbksurl + ", tbkurl=" + tbkurl + ", taokouling=" + taokouling + ", couponsnum=" + couponsnum
				+ ", couponsonlynum=" + couponsonlynum + ", couponsprice=" + couponsprice + ", begintime=" + begintime + ", endtime=" + endtime + ", couponsonurl=" + couponsonurl + ", qtkl=" + qtkl
				+ ", couponsonsurl=" + couponsonsurl + ", yxjh=" + yxjh + "]";
	}





}
