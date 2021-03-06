package org.jeewx.api.wxstore;

import java.util.ArrayList;
import java.util.List;

import org.jeewx.api.wxstore.deliveryMoney.JwDeliveryMoneyAPI;
import org.jeewx.api.wxstore.deliveryMoney.model.DeliveryMoney;
import org.jeewx.api.wxstore.deliveryMoney.model.DeliveryMoneyCustomInfo;
import org.jeewx.api.wxstore.deliveryMoney.model.DeliveryMoneyNormalInfo;
import org.jeewx.api.wxstore.deliveryMoney.model.DeliveryMoneyRtnInfo;
import org.jeewx.api.wxstore.deliveryMoney.model.DeliveryMoneyTopFreeInfo;
import org.jeewx.api.wxstore.group.JwGroupManangerAPI;
import org.jeewx.api.wxstore.group.model.Group;
import org.jeewx.api.wxstore.group.model.GroupDetailInfo;
import org.jeewx.api.wxstore.group.model.GroupProduct;
import org.jeewx.api.wxstore.group.model.GroupProductInfo;
import org.jeewx.api.wxstore.group.model.GroupRtnInfo;
import org.jeewx.api.wxstore.order.JwOrderManagerAPI;
import org.jeewx.api.wxstore.order.model.OrderPara;
import org.jeewx.api.wxstore.product.JwProductAPI;
import org.jeewx.api.wxstore.product.model.AttrExt;
import org.jeewx.api.wxstore.product.model.AttrInfo;
import org.jeewx.api.wxstore.product.model.AttrInfoDetail;
import org.jeewx.api.wxstore.product.model.CommodityRtnInfo;
import org.jeewx.api.wxstore.product.model.DeliveryInfo;
import org.jeewx.api.wxstore.product.model.DeliveryInfoExpress;
import org.jeewx.api.wxstore.product.model.Product;
import org.jeewx.api.wxstore.shelf.JwShelfAPI;
import org.jeewx.api.wxstore.shelf.model.EidCInfo;
import org.jeewx.api.wxstore.shelf.model.EidEInfo;
import org.jeewx.api.wxstore.shelf.model.GroupCInfo;
import org.jeewx.api.wxstore.shelf.model.GroupEInfo;
import org.jeewx.api.wxstore.shelf.model.GroupEInfos;
import org.jeewx.api.wxstore.shelf.model.Shelf;
import org.jeewx.api.wxstore.stock.JwStockAPI;
import org.jeewx.api.wxstore.stock.model.StockInfo;


public class Test {

	private static String appid = "wxb512901288a94943";
	private static String appscret = "6f94b81b49cf9f89fafe305dcaf2c632";
	
	String filePath = "C:/Users/wangbingwang/Desktop/wxpic/";
	String fileName = "gongju1.jpg";
	
    String newAccessToken = "";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();
		// ????????????
		//t.hjDelShelf();
		t.getAllShelf();
		//t.hjUpdateShelf();
		//t.getByShelfId();
		//t.hjAddTest1();
		//t.hjAddTest2();
		// ????????????
		//t.ddGetidTest();
		//t.ddgetBystatusTest();
		// ????????????
		//t.fzSubStockTest();
		//t.fzAddStockTest();
		// ????????????
		//t.fzAddTest();
		//t.fzgetByidTest();
		//t.fzUpdagePropertisTest();
		//t.fzUpdageProductTest();
		//t.fzDelTest();
		//t.fzgetAllTest();
		// ????????????
		//t.spAddTest();
		// ????????????
		//t.yfAddTest();
		//t.yfUpdateTest();
		//t.getMbTest();
		//t.getAllTest();
	}
	
	public void hjDelShelf() {
		JwShelfAPI wss = new JwShelfAPI();
		wss.doDelShelfManager(newAccessToken,2);
	}
	
	// ??????????????????
	public void hjUpdateShelf() {
		JwShelfAPI wss = new JwShelfAPI();
		JwProductAPI wcs = new JwProductAPI();
		Shelf shelf = new Shelf();
		EidEInfo e = new EidEInfo();
		e.setEid(5);
		e.setImg_background(wcs.uploadImg(newAccessToken,filePath, fileName));
		GroupEInfos group_infos = new GroupEInfos();
		List<GroupEInfo> groups = new ArrayList<GroupEInfo>();
		GroupEInfo a = new GroupEInfo();
		a.setGroup_id(43);
		groups.add(a);
		GroupEInfo b = new GroupEInfo();
		a.setGroup_id(44);
		groups.add(b);
		group_infos.setGroups(groups);
		e.setGroup_infos(group_infos);
		shelf.setShelf_data(e);
		shelf.setShelf_banner(wcs.uploadImg(newAccessToken,filePath, fileName));
		shelf.setShelf_name("????????????");
		shelf.setShelf_id(2);
		wss.doUpdateExpress(newAccessToken,shelf);
	}
	
	// ????????????????????????
	public void getAllShelf() {
		JwShelfAPI wss = new JwShelfAPI();
		wss.getAllShelf(newAccessToken);
	}
	
	
	// ????????????ID??????????????????
	public void getByShelfId() {
		JwShelfAPI wss = new JwShelfAPI();
		wss.getByShelfId(newAccessToken,4);
	}
	
	// ????????????
	public void hjAddTest1() {
		JwShelfAPI wss = new JwShelfAPI();
		JwProductAPI wcs = new JwProductAPI();
		Shelf shelf = new Shelf();
		EidEInfo e = new EidEInfo();
		e.setEid(5);
		e.setImg_background(wcs.uploadImg(newAccessToken,filePath, fileName));
		GroupEInfos group_infos = new GroupEInfos();
		List<GroupEInfo> groups = new ArrayList<GroupEInfo>();
		GroupEInfo a = new GroupEInfo();
		a.setGroup_id(43);
		groups.add(a);
		GroupEInfo b = new GroupEInfo();
		a.setGroup_id(44);
		groups.add(b);
		group_infos.setGroups(groups);
		e.setGroup_infos(group_infos);
		shelf.setShelf_data(e);
		shelf.setShelf_banner(wcs.uploadImg(newAccessToken,filePath, fileName));
		shelf.setShelf_name("????????????");
		wss.doAddExpress(newAccessToken,shelf);
	}
	
	// ????????????
	public void hjAddTest2() {
		JwShelfAPI wss = new JwShelfAPI();
		JwProductAPI wcs = new JwProductAPI();
		Shelf shelf = new Shelf();
		EidCInfo e = new EidCInfo();
		e.setEid(3);
		GroupCInfo group_info = new GroupCInfo();
		group_info.setGroup_id(205038469);
		group_info.setImg(wcs.uploadImg(newAccessToken,filePath, fileName));
		e.setGroup_info(group_info);
		shelf.setShelf_data(e);
		shelf.setShelf_banner(wcs.uploadImg(newAccessToken,filePath, fileName));
		shelf.setShelf_name("????????????");
		wss.doAddExpress(newAccessToken,shelf);
	}
	
	// ????????????ID??????????????????
	public void ddGetidTest() {
		JwOrderManagerAPI woms = new JwOrderManagerAPI();
		woms.getByOrderId(newAccessToken,"7197417460812533543");
	}
	
	public void ddgetBystatusTest() {
		JwOrderManagerAPI woms = new JwOrderManagerAPI();
		OrderPara orderPara = new OrderPara();
		orderPara.setStatus(2);
		orderPara.setBegintime(1397130460);
		orderPara.setEndtime(1397130470);
		woms.getByFilter(newAccessToken,orderPara);
	}
	
	// ????????????
	public void fzAddStockTest() {
		JwStockAPI JwStockAPI = new JwStockAPI();
		StockInfo stockInfo = new StockInfo();
		stockInfo.setProduct_id("pqII7uOmhvayKYQyZdXEa_7qfAQM");
		stockInfo.setSku_info("");
		stockInfo.setQuantity(10);
		JwStockAPI.doAddStock(newAccessToken,stockInfo);
	}
	
	// ????????????
	public void fzSubStockTest() {
		JwStockAPI JwStockAPI = new JwStockAPI();
		StockInfo stockInfo = new StockInfo();
		stockInfo.setProduct_id("pqII7uOmhvayKYQyZdXEa_7qfAQM");
		stockInfo.setSku_info("");
		stockInfo.setQuantity(5);
		JwStockAPI.doSubStock(newAccessToken,stockInfo);
	}
		
	
	// ??????????????????
	public void fzDelTest() {
		JwGroupManangerAPI wgms = new JwGroupManangerAPI();
		GroupRtnInfo gdis = wgms.doDelGroupManager(newAccessToken,205038402);
	}
	
	// ??????????????????
	public void fzgetAllTest() {
		JwGroupManangerAPI wgms = new JwGroupManangerAPI();
		List<GroupDetailInfo> gdis = wgms.getAllGroup(newAccessToken);
	}
	
	// ??????????????????
	public void fzUpdageProductTest() {
		JwGroupManangerAPI wgms = new JwGroupManangerAPI();
		GroupProductInfo g = new GroupProductInfo();
		g.setGroup_id(205038402);
		List<GroupProduct> product = new ArrayList<GroupProduct>();
		GroupProduct gp = new GroupProduct();
		gp.setProduct_id("pqII7uOmhvayKYQyZdXEa_7qfAQM");
		gp.setMod_action(0);
		product.add(gp);
		g.setProduct(product);
		GroupRtnInfo gdi = wgms.doUpdateGroupManagerProduct(newAccessToken,g);
	}
	
	// ??????????????????
	public void fzUpdagePropertisTest() {
		JwGroupManangerAPI wgms = new JwGroupManangerAPI();
		Group g = new Group();
		g.setGroup_id(205038402);
		g.setGroup_name("????????????22");
		GroupRtnInfo gdi = wgms.doUpdateGroupManagerProperties(newAccessToken,g);
	}
	
	// ????????????ID??????????????????
	public void fzgetByidTest() {
		JwGroupManangerAPI wgms = new JwGroupManangerAPI();
		GroupDetailInfo gdi = wgms.getByGroupId(newAccessToken,205038402);
	}
	
	// ????????????
	public void fzAddTest() {
		JwGroupManangerAPI wgms = new JwGroupManangerAPI();
		Group group = new Group();
		GroupDetailInfo group_detail = new GroupDetailInfo();
		group_detail.setGroup_name("????????????");
		List<String> product_list = new ArrayList<String>();
		product_list.add("pqII7uOqbiJvESwQls_smyB2Z60U");
		product_list.add("pqII7uOmhvayKYQyZdXEa_7qfAQM");
		group_detail.setProduct_list(product_list);
		group.setGroup_detail(group_detail);
		GroupRtnInfo r = wgms.doAddGroupManager(newAccessToken,group);
	}
	
	// ????????????
    public void spAddTest() {
    	JwProductAPI wcs = new JwProductAPI();
    	
    	Product product = new Product();
    	// ????????????
    	AttrInfo attrInfo = new AttrInfo();
    	attrInfo.setName("??????????????????");
    	attrInfo.setMain_img(wcs.uploadImg(newAccessToken,filePath, fileName));
    	List<String> imgs = new ArrayList<String>();
    	imgs.add(wcs.uploadImg(newAccessToken,filePath, fileName));
    	attrInfo.setImg(imgs);
    	// ??????????????????
    	List<AttrInfoDetail> details = new ArrayList<AttrInfoDetail>();
    	AttrInfoDetail detail1 = new AttrInfoDetail();
    	detail1.setText("??????");
    	detail1.setImg(wcs.uploadImg(newAccessToken,filePath, fileName));
    	details.add(detail1);
    	AttrInfoDetail detail2 = new AttrInfoDetail();
    	detail2.setText("??????");
    	detail2.setImg(wcs.uploadImg(newAccessToken,filePath, fileName));
    	details.add(detail2);
    	attrInfo.setDetail(details);
    	attrInfo.setBuy_limit(56);
    	List<String> categorylist = new ArrayList<String>();
    	categorylist.add("537074298");
    	attrInfo.setCategory_id(categorylist);
    	product.setProduct_base(attrInfo);
    	// ??????????????????
    	AttrExt attrExt = new AttrExt();
    	product.setAttrext(attrExt);
    	// ????????????
    	DeliveryInfo deliveryInfo = new DeliveryInfo();
    	deliveryInfo.setDelivery_type(0);
    	deliveryInfo.setTemplate_id(0);
    	List<DeliveryInfoExpress> expressList = new ArrayList<DeliveryInfoExpress>();
    	DeliveryInfoExpress express1 = new DeliveryInfoExpress();
    	express1.setId(10000027);
    	express1.setPrice(800);
    	expressList.add(express1);
    	DeliveryInfoExpress express2 = new DeliveryInfoExpress();
    	express2.setId(10000028);
    	express2.setPrice(900);
    	expressList.add(express2);
    	deliveryInfo.setExpress(expressList);
    	product.setDelivery_info(deliveryInfo);
    	
    	CommodityRtnInfo object = wcs.doAddCommodity(newAccessToken,product);
    }
	
	// ????????????ID???????????????
	public void getAllTest() {
		JwDeliveryMoneyAPI wps = new JwDeliveryMoneyAPI();
		List<DeliveryMoney> p = wps.getAllExpress(newAccessToken);
		//System.out.println(p.getTemplate_id());
	}
	
	// ????????????ID???????????????
	public void getMbTest() {
		JwDeliveryMoneyAPI wps = new JwDeliveryMoneyAPI();
		DeliveryMoney p = wps.getByIdExpress(newAccessToken,205036446);
		System.out.println(p.getTemplate_id());
	}

	// ??????????????????????????????
	public void yfUpdateTest() {
		JwDeliveryMoneyAPI wps = new JwDeliveryMoneyAPI();
		DeliveryMoney p = new DeliveryMoney();
		p.setTemplate_id(205035813);
		p.setAssumer(0);
		p.setName("Test2222");
		p.setValuation(0);
		List<DeliveryMoneyTopFreeInfo> topFee = new ArrayList<DeliveryMoneyTopFreeInfo>();
		DeliveryMoneyTopFreeInfo ptf = new DeliveryMoneyTopFreeInfo();
		ptf.setType(10000029);
		
		DeliveryMoneyNormalInfo pni = new DeliveryMoneyNormalInfo();
		pni.setAddFees(3);
		pni.setAddStandards(1);
		pni.setStartFees(8);
		pni.setStartStandards(2);
		ptf.setNormal(pni);
		
		List<DeliveryMoneyCustomInfo> pci = new ArrayList<DeliveryMoneyCustomInfo>();
		DeliveryMoneyCustomInfo pc = new DeliveryMoneyCustomInfo();
		pc.setAddFees(11);
		pc.setAddStandards(2);
		pc.setStartFees(8);
		pc.setStartStandards(1);
		pc.setDestCountry("??????");
		pc.setDestProvince("?????????");
		pc.setDestCity("?????????");
		pci.add(pc);
		ptf.setCustom(pci);
		topFee.add(ptf);
		p.setTopFee(topFee);
		DeliveryMoneyRtnInfo rtn = wps.doUpdateExpress(newAccessToken,p);
		System.out.println(rtn.getErrmsg());
	}
	
	// ??????????????????????????????
	public void yfAddTest() {
		JwDeliveryMoneyAPI wps = new JwDeliveryMoneyAPI();
		DeliveryMoney p = new DeliveryMoney();
		p.setAssumer(0);
		p.setName("testexpress");
		p.setValuation(0);
		List<DeliveryMoneyTopFreeInfo> topFee = new ArrayList<DeliveryMoneyTopFreeInfo>();
		DeliveryMoneyTopFreeInfo ptf = new DeliveryMoneyTopFreeInfo();
		ptf.setType(10000027);
		
		DeliveryMoneyNormalInfo pni = new DeliveryMoneyNormalInfo();
		pni.setAddFees(3);
		pni.setAddStandards(1);
		pni.setStartFees(8);
		pni.setStartStandards(2);
		ptf.setNormal(pni);
		
		List<DeliveryMoneyCustomInfo> pci = new ArrayList<DeliveryMoneyCustomInfo>();
		DeliveryMoneyCustomInfo pc = new DeliveryMoneyCustomInfo();
		pc.setAddFees(11);
		pc.setAddStandards(2);
		pc.setStartFees(8);
		pc.setStartStandards(1);
		pc.setDestCountry("??????");
		pc.setDestProvince("?????????");
		pc.setDestCity("?????????");
		pci.add(pc);
		ptf.setCustom(pci);
		topFee.add(ptf);
		p.setTopFee(topFee);
		DeliveryMoneyRtnInfo rtn = wps.doAddExpress(newAccessToken, p);
	}
}
