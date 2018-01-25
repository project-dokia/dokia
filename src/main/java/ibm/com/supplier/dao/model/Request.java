package ibm.com.supplier.dao.model;

public class Request {
	
    	private String type;

    private String number;
    private String country;
    private String status;
    private String name;

    private String lob;
    private String loa;
    private String internalProject;
    private String contractNumber; //exemplo Brazil BZBA733 obs. pesquisa no Project Room, ideia migrar para o BMSIW
        
    private String loaSipYn;
    private String loaCnYn;
    private String loaCustomer;
    private String sip;

    private String customerNumber;
    private String customerName;
        
    private String dpe;
    private String projectManager;

    private String purchasingCompany;
    private String requestType;
    private String purchaseType;

    private String serviceTermOrSWTerm;
    private String serviceTermOrSWTermComments;
    private String serviceTermOrSWTermStartDate;
    private String serviceTermOrSWTermEndDate;
        
    private String serviceDescription;

    private String capexYN;
    private String capexNumber;

    private String complementaryBondYN;
    private String complementaryBond;
    private String complementaryPmoBond;

    private String complianceEngineering;
    private String reviewers; //list

    private String purchaseDescription;

    private String productCategory;
    private String productId;

    private String major;
    private String costCenter;

    private String workNumberYN;
    private String workNumbers;//list

    private String deliveryAddress; // list localidades ibm

    private String deliveryCompanyName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryStateRegion;
    private String deliveryPostalCode;

    private String responsiblePurchase;
    private String businessCase;
    private String bondApprovers; //list pode ser nula (N/A)

    private String generalCommments;
    private String businessJustification;

        // Quotation & Backups to Approval
    private String partNumberOrQuotation;
        //if PartNumber list
    private String partNumber;
    private String quantity;


	public String capex_y_n;
	public String capex_num;
	public String complementary_bond;
	public String complementary_bond_number;
	public String pmo_comp_bond;
	public String complianceEngineer;
	public String requester;
	public String reviewers1;
	public String reviewers2;
	public String purchase_description;
	public String ser_nropar_1;
	public String ser_cod_serv1;
	public String ser_nropar_1_1;
	public String ser_column1;
	public String ser_nroord_1;
	public String ser_nroord_1_1;
	public String ser_saldo_M1;
	public String ser_saldo_A1;
	public String add_xser_line_2;
	public String ser_nropar_2;
	public String ser_cod_serv2;
	public String ser_nropar_2_1;
	public String ser_column2;
	public String ser_nroord_2;
	public String ser_nroord_2_1;
	public String ser_saldo_M2;
	public String ser_saldo_A2;
	public String add_xser_line_3;
	public String ser_nropar_3;
	public String ser_cod_serv3;
	public String ser_nropar_3_1;
	public String ser_column3;
	public String ser_nroord_3;
	public String ser_nroord_3_1;
	public String ser_saldo_M3;
	public String ser_saldo_A3;
	public String add_xser_line_4;
	public String ser_nropar_4;
	public String ser_cod_serv4;
	public String ser_nropar_4_1;
	public String ser_column4;
	public String ser_nroord_4;
	public String ser_nroord_4_1;
	public String ser_saldo_M4;
	public String ser_saldo_A4;
	public String add_xser_line_5;
	public String ser_nropar_5;
	public String ser_cod_serv5;
	public String ser_nropar_5_1;
	public String ser_column5;
	public String ser_nroord_5;
	public String ser_nroord_5_1;
	public String ser_saldo_M5;
	public String ser_saldo_A5;
	public String add_xser_line_6;
	public String ser_nropar_6;
	public String ser_cod_serv6;
	public String ser_nropar_6_1;
	public String ser_column6;
	public String ser_nroord_6;
	public String ser_nroord_6_1;
	public String ser_saldo_M6;
	public String ser_saldo_A6;
	public String add_xser_line_7;
	public String ser_nropar_7;
	public String ser_cod_serv7;
	public String ser_nropar_7_1;
	public String ser_column7;
	public String ser_nroord_7;
	public String ser_nroord_7_1;
	public String ser_saldo_M7;
	public String ser_saldo_A7;
	public String add_xser_line_8;
	public String ser_nropar_8;
	public String ser_cod_serv8;
	public String ser_nropar_8_1;
	public String ser_column8;
	public String ser_nroord_8;
	public String ser_nroord_8_1;
	public String ser_saldo_M8;
	public String ser_saldo_A8;
	public String add_xser_line_9;
	public String ser_nropar_9;
	public String ser_cod_serv9;
	public String ser_nropar_9_1;
	public String ser_column9;
	public String ser_nroord_9;
	public String ser_nroord_9_1;
	public String ser_saldo_M9;
	public String ser_saldo_A9;
	public String add_xser_line_10;
	public String ser_nropar_10;
	public String ser_cod_serv10;
	public String ser_nropar_10_1;
	public String ser_column10;
	public String ser_nroord_10;
	public String ser_nroord_10_1;
	public String ser_saldo_M10;
	public String ser_saldo_A10;
	public String add_xser_line_11;
	public String ser_nropar_11;
	public String ser_cod_serv11;
	public String ser_nropar_11_1;
	public String ser_column11;
	public String ser_nroord_11;
	public String ser_nroord_11_1;
	public String ser_saldo_M11;
	public String ser_saldo_A11;
	public String add_xser_line_12;
	public String ser_nropar_12;
	public String ser_cod_serv12;
	public String ser_nropar_12_1;
	public String ser_column12;
	public String ser_nroord_12;
	public String ser_nroord_12_1;
	public String ser_saldo_M12;
	public String ser_saldo_A12;
	public String add_xser_line_13;
	public String ser_nropar_13;
	public String ser_cod_serv13;
	public String ser_nropar_13_1;
	public String ser_column13;
	public String ser_nroord_13;
	public String ser_nroord_13_1;
	public String ser_saldo_M13;
	public String ser_saldo_A13;
	public String add_xser_line_14;
	public String ser_nropar_14;
	public String ser_cod_serv14;
	public String ser_nropar_14_1;
	public String ser_column14;
	public String ser_nroord_14;
	public String ser_nroord_14_1;
	public String ser_saldo_M14;
	public String ser_saldo_A14;
	public String add_xser_line_15;
	public String ser_nropar_15;
	public String ser_cod_serv15;
	public String ser_nropar_15_1;
	public String ser_column15;
	public String ser_nroord_15;
	public String ser_nroord_15_1;
	public String ser_saldo_M15;
	public String ser_saldo_A15;
	public String sfd;
	public String bond_non_po;
	public String division_MEX;
	public String division_BRA;
	public String division_SSA;
	public String prod_cat_ITS_BRA;
	public String prod_cat_ITMX_SSA_M1;
	public String prod_cat_ITMX_SSA_A1;
	public String prod_cat_ITMX_SSA_M2;
	public String prod_cat_ITMX_SSA_A2;
	public String prod_cat_ITMX_SSA_M3;
	public String prod_cat_ITMX_SSA_A3;
	public String prod_cat_ITMX_SSA_M4;
	public String prod_cat_ITMX_SSA_A4;
	public String prod_cat_ITMX_SSA_M5;
	public String prod_cat_ITMX_SSA_A5;
	public String prod_cat_ITMX_SSA_M6;
	public String prod_cat_ITMX_SSA_A6;
	public String prod_cat_ITMX_SSA_M7;
	public String prod_cat_ITMX_SSA_A7;
	public String prod_cat_ITMX_SSA_M8;
	public String prod_cat_ITMX_SSA_A8;
	public String prod_cat_ITMX_SSA_M9;
	public String prod_cat_ITMX_SSA_A9;
	public String prod_cat_ITMX_SSA_M10;
	public String prod_cat_ITMX_SSA_A10;
	public String prod_cat_ITMX_SSA_M11;
	public String prod_cat_ITMX_SSA_A11;
	public String prod_cat_ITMX_SSA_M12;
	public String prod_cat_ITMX_SSA_A12;
	public String prod_cat_ITMX_SSA_M13;
	public String prod_cat_ITMX_SSA_A13;
	public String prod_cat_ITMX_SSA_M14;
	public String prod_cat_ITMX_SSA_A14;
	public String prod_cat_ITMX_SSA_M15;
	public String prod_cat_ITMX_SSA_A15;
	public String product_ID;
	public String major_SO_MEX;
	public String major_SO_CHI;
	public String major_SO_COL;
	public String major_SO_VEN;
	public String major_SO_PER;
	public String major_SO_SSA;
	public String major_SO_BRA;
	public String major_MRX_BRA;
	public String major_ITS_BRA;
	public String major_ITSMRX_SSA_M1;
	public String major_ITSMRX_SSA_A1;
	public String major_ITSMRX_SSA_M2;
	public String major_ITSMRX_SSA_A2;
	public String major_ITSMRX_SSA_M3;
	public String major_ITSMRX_SSA_A3;
	public String major_ITSMRX_SSA_M4;
	public String major_ITSMRX_SSA_A4;
	public String major_ITSMRX_SSA_M5;
	public String major_ITSMRX_SSA_A5;
	public String major_ITSMRX_SSA_M6;
	public String major_ITSMRX_SSA_A6;
	public String major_ITSMRX_SSA_M7;
	public String major_ITSMRX_SSA_A7;
	public String major_ITSMRX_SSA_M8;
	public String major_ITSMRX_SSA_A8;
	public String major_ITSMRX_SSA_M9;
	public String major_ITSMRX_SSA_A9;
	public String major_ITSMRX_SSA_M10;
	public String major_ITSMRX_SSA_A10;
	public String major_ITSMRX_SSA_M11;
	public String major_ITSMRX_SSA_A11;
	public String major_ITSMRX_SSA_M12;
	public String major_ITSMRX_SSA_A12;
	public String major_ITSMRX_SSA_M13;
	public String major_ITSMRX_SSA_A13;
	public String major_ITSMRX_SSA_M14;
	public String major_ITSMRX_SSA_A14;
	public String major_ITSMRX_SSA_M15;
	public String major_ITSMRX_SSA_A15;
	public String cost_center_SO_MEX;
	public String cost_center_MRX_ITS_MEX;
	public String cost_center_BRA_SSA;
	public String work_number_1;
	public String work_number_auto_1;
	public String comment_work_number_2;
	public String add_work_number_3;
	public String work_number_3;
	public String work_number_auto_3;
	public String comment_work_number_3;
	public String add_work_number_4;
	public String work_number_4;
	public String work_number_auto_4;
	public String comment_work_number_4;
	public String add_work_number_5;
	public String work_number_5;
	public String work_number_auto_5;
	public String comment_work_number_5;
	public String add_work_number_6;
	public String work_number_6;
	public String work_number_auto_6;
	public String comment_work_number_6;
	public String add_work_number_7;
	public String work_number_8;
	public String work_number_auto_8;
	public String comment_work_number_8;
	public String add_work_number_9;
	public String work_number_9;
	public String work_number_auto_9;
	public String comment_work_number_9;
	public String add_work_number_10;
	public String work_number_10;
	public String work_number_auto_10;
	public String comment_work_number_10;
	public String add_work_number_11;
	public String work_number_11;
	public String work_number_auto_11;
	public String comment_work_number_11;
	public String add_work_number_12;
	public String work_number_12;
	public String work_number_auto_12;
	public String comment_work_number_12;
	public String add_work_number_13;
	public String work_number_13;
	public String work_number_auto_13;
	public String comment_work_number_13;
	public String add_work_number_14;
	public String work_number_14;
	public String work_number_auto_14;
	public String comment_work_number_14;
	public String add_work_number_15;
	public String work_number_15;
	public String work_number_auto_15;
	public String comment_work_number_15;
	public String company_bra;
	public String company_mex;
	public String company_per;
	public String company_ecu;
	public String company_arg;
	public String company_chi;
	public String company_col;
	public String company_ven;
	public String company_uru;
	public String delivery_address;
	public String address_information;
	public String company_name;
	public String street;
	public String city;
	public String state_region;
	public String postal_code;
	public String company_name_ecu;
	public String stree_ecu;
	public String city_ecu;
	public String state_region_ecu;
	public String postal_code_ecu;
	public String company_name_arg;
	public String stree_arg;
	public String city_arg;
	public String state_region_arg;
	public String postal_code_arg;
	public String company_name_uru;
	public String stree_uru;
	public String city_uru;
	public String state_region_uru;
	public String postal_code_uru;
	public String company_name_chi;
	public String stree_chi;
	public String city_chi;
	public String state_region_chi;
	public String postal_code_chi;
	public String company_name_chi1;
	public String stree_chi1;
	public String city_chi1;
	public String state_region_chi1;
	public String postal_code_chi1;
	public String company_name_col;
	public String stree_col;
	public String city_col;
	public String state_region_col;
	public String postal_code_col;
	public String company_name_ven;
	public String stree_ven;
	public String city_ven;
	public String state_region_ven;
	public String postal_code_ve ;
	public String company_name_bra1;
	public String stree_bra1;
	public String city_bra1;
	public String state_region_bra1;
	public String postal_code_bra1;
	public String company_name_bra2;
	public String stree_bra2;
	public String city_bra2;
	public String state_region_bra2;
	public String postal_code_bra2;
	public String company_name_bra3;
	public String stree_bra3;
	public String city_bra3;
	public String state_region_bra3;
	public String postal_code_bra3;
	public String company_name_per1;
	public String stree_per1;
	public String city_per1;
	public String state_region_per1;
	public String postal_code_per1;
	public String company_name_per2;
	public String stree_per2;
	public String city_per2;
	public String state_region_per2;
	public String postal_code_per2;
	public String company_name_mex1;
	public String stree_mex1;
	public String city_mex1;
	public String state_region_mex1;
	public String postal_code_mex1;
	public String company_name_mex2;
	public String stree_mex2;
	public String city_mex2;
	public String state_region_mex2;
	public String postal_code_mex2;
	public String company_name_mex3;
	public String stree_mex3;
	public String city_mex3;
	public String state_region_mex3;
	public String postal_code_mex3;
	public String company_name_mex4;
	public String stree_mex4;
	public String city_mex4;
	public String state_region_mex4;
	public String postal_code_mex4;
	public String company_name_mex5;
	public String stree_mex5;
	public String city_mex5;
	public String state_region_mex5;
	public String postal_code_mex5;
	public String company_name_mex6;
	public String stree_mex6;
	public String city_mex6;
	public String state_region_mex6;
	public String postal_code_mex6;
	public String responsible_purchase;
	public String busines_case;
	public String approver1;
	public String approver2;
	public String approver3;
	public String approver4;
	public String approver5;
	public String comments;
	public String business_justification;
	public String history;
	public String customer_name;
	public String contract_number;
	public String division;
	public String product_category;
	public String major_account;
	public String cost_center;
	public String total_amount;
	public String part_number_a;
	public String quantity_a;
	public String add_PN_QTY_b;
	public String part_number_b;
	public String quantity_b;
	public String add_PN_QTY_c;
	public String part_number_c;
	public String quantity_c;
	public String add_PN_QTY_d;
	public String part_number_d;
	public String quantity_d;
	public String add_PN_QTY_e;
	public String part_number_e;
	public String quantity_e;
	public String other_PN_QTY;
	public String attach_quotation;
	public String attach;
	public String calculation;
	public String currency_B;
	public String currency_M;
	public String currency_A;
	public String currency_C;
	public String currency_O;
	public String currency_E;
	public String currency_P;
	public String currency_U;
	public String currency_V;
	public String last_approver_1_manual;
	public String last_approver_1_AUTO;
	public String last_approver_1_AUTO_1;
	public String change_approer;
	public String other_approver_SSA;
	public String other_approver_BRAMEX;
	public String add_approver_2;
	public String other_approver_2;
	public String add_approver_3;
	public String other_approver_3; 
    
	public String getCapex_y_n() {
		return capex_y_n;
	}
	public void setCapex_y_n(String capex_y_n) {
		this.capex_y_n = capex_y_n;
	}
	public String getCapex_num() {
		return capex_num;
	}
	public void setCapex_num(String capex_num) {
		this.capex_num = capex_num;
	}
	public String getComplementary_bond() {
		return complementary_bond;
	}
	public void setComplementary_bond(String complementary_bond) {
		this.complementary_bond = complementary_bond;
	}
	public String getComplementary_bond_number() {
		return complementary_bond_number;
	}
	public void setComplementary_bond_number(String complementary_bond_number) {
		this.complementary_bond_number = complementary_bond_number;
	}
	public String getPmo_comp_bond() {
		return pmo_comp_bond;
	}
	public void setPmo_comp_bond(String pmo_comp_bond) {
		this.pmo_comp_bond = pmo_comp_bond;
	}
	public String getComplianceEngineer() {
		return complianceEngineer;
	}
	public void setComplianceEngineer(String complianceEngineer) {
		this.complianceEngineer = complianceEngineer;
	}
	public String getRequester() {
		return requester;
	}
	public void setRequester(String requester) {
		this.requester = requester;
	}
	public String getReviewers1() {
		return reviewers1;
	}
	public void setReviewers1(String reviewers1) {
		this.reviewers1 = reviewers1;
	}
	public String getReviewers2() {
		return reviewers2;
	}
	public void setReviewers2(String reviewers2) {
		this.reviewers2 = reviewers2;
	}
	public String getPurchase_description() {
		return purchase_description;
	}
	public void setPurchase_description(String purchase_description) {
		this.purchase_description = purchase_description;
	}
	public String getSer_nropar_1() {
		return ser_nropar_1;
	}
	public void setSer_nropar_1(String ser_nropar_1) {
		this.ser_nropar_1 = ser_nropar_1;
	}
	public String getSer_cod_serv1() {
		return ser_cod_serv1;
	}
	public void setSer_cod_serv1(String ser_cod_serv1) {
		this.ser_cod_serv1 = ser_cod_serv1;
	}
	public String getSer_nropar_1_1() {
		return ser_nropar_1_1;
	}
	public void setSer_nropar_1_1(String ser_nropar_1_1) {
		this.ser_nropar_1_1 = ser_nropar_1_1;
	}
	public String getSer_column1() {
		return ser_column1;
	}
	public void setSer_column1(String ser_column1) {
		this.ser_column1 = ser_column1;
	}
	public String getSer_nroord_1() {
		return ser_nroord_1;
	}
	public void setSer_nroord_1(String ser_nroord_1) {
		this.ser_nroord_1 = ser_nroord_1;
	}
	public String getSer_nroord_1_1() {
		return ser_nroord_1_1;
	}
	public void setSer_nroord_1_1(String ser_nroord_1_1) {
		this.ser_nroord_1_1 = ser_nroord_1_1;
	}
	public String getSer_saldo_M1() {
		return ser_saldo_M1;
	}
	public void setSer_saldo_M1(String ser_saldo_M1) {
		this.ser_saldo_M1 = ser_saldo_M1;
	}
	public String getSer_saldo_A1() {
		return ser_saldo_A1;
	}
	public void setSer_saldo_A1(String ser_saldo_A1) {
		this.ser_saldo_A1 = ser_saldo_A1;
	}
	public String getAdd_xser_line_2() {
		return add_xser_line_2;
	}
	public void setAdd_xser_line_2(String add_xser_line_2) {
		this.add_xser_line_2 = add_xser_line_2;
	}
	public String getSer_nropar_2() {
		return ser_nropar_2;
	}
	public void setSer_nropar_2(String ser_nropar_2) {
		this.ser_nropar_2 = ser_nropar_2;
	}
	public String getSer_cod_serv2() {
		return ser_cod_serv2;
	}
	public void setSer_cod_serv2(String ser_cod_serv2) {
		this.ser_cod_serv2 = ser_cod_serv2;
	}
	public String getSer_nropar_2_1() {
		return ser_nropar_2_1;
	}
	public void setSer_nropar_2_1(String ser_nropar_2_1) {
		this.ser_nropar_2_1 = ser_nropar_2_1;
	}
	public String getSer_column2() {
		return ser_column2;
	}
	public void setSer_column2(String ser_column2) {
		this.ser_column2 = ser_column2;
	}
	public String getSer_nroord_2() {
		return ser_nroord_2;
	}
	public void setSer_nroord_2(String ser_nroord_2) {
		this.ser_nroord_2 = ser_nroord_2;
	}
	public String getSer_nroord_2_1() {
		return ser_nroord_2_1;
	}
	public void setSer_nroord_2_1(String ser_nroord_2_1) {
		this.ser_nroord_2_1 = ser_nroord_2_1;
	}
	public String getSer_saldo_M2() {
		return ser_saldo_M2;
	}
	public void setSer_saldo_M2(String ser_saldo_M2) {
		this.ser_saldo_M2 = ser_saldo_M2;
	}
	public String getSer_saldo_A2() {
		return ser_saldo_A2;
	}
	public void setSer_saldo_A2(String ser_saldo_A2) {
		this.ser_saldo_A2 = ser_saldo_A2;
	}
	public String getAdd_xser_line_3() {
		return add_xser_line_3;
	}
	public void setAdd_xser_line_3(String add_xser_line_3) {
		this.add_xser_line_3 = add_xser_line_3;
	}
	public String getSer_nropar_3() {
		return ser_nropar_3;
	}
	public void setSer_nropar_3(String ser_nropar_3) {
		this.ser_nropar_3 = ser_nropar_3;
	}
	public String getSer_cod_serv3() {
		return ser_cod_serv3;
	}
	public void setSer_cod_serv3(String ser_cod_serv3) {
		this.ser_cod_serv3 = ser_cod_serv3;
	}
	public String getSer_nropar_3_1() {
		return ser_nropar_3_1;
	}
	public void setSer_nropar_3_1(String ser_nropar_3_1) {
		this.ser_nropar_3_1 = ser_nropar_3_1;
	}
	public String getSer_column3() {
		return ser_column3;
	}
	public void setSer_column3(String ser_column3) {
		this.ser_column3 = ser_column3;
	}
	public String getSer_nroord_3() {
		return ser_nroord_3;
	}
	public void setSer_nroord_3(String ser_nroord_3) {
		this.ser_nroord_3 = ser_nroord_3;
	}
	public String getSer_nroord_3_1() {
		return ser_nroord_3_1;
	}
	public void setSer_nroord_3_1(String ser_nroord_3_1) {
		this.ser_nroord_3_1 = ser_nroord_3_1;
	}
	public String getSer_saldo_M3() {
		return ser_saldo_M3;
	}
	public void setSer_saldo_M3(String ser_saldo_M3) {
		this.ser_saldo_M3 = ser_saldo_M3;
	}
	public String getSer_saldo_A3() {
		return ser_saldo_A3;
	}
	public void setSer_saldo_A3(String ser_saldo_A3) {
		this.ser_saldo_A3 = ser_saldo_A3;
	}
	public String getAdd_xser_line_4() {
		return add_xser_line_4;
	}
	public void setAdd_xser_line_4(String add_xser_line_4) {
		this.add_xser_line_4 = add_xser_line_4;
	}
	public String getSer_nropar_4() {
		return ser_nropar_4;
	}
	public void setSer_nropar_4(String ser_nropar_4) {
		this.ser_nropar_4 = ser_nropar_4;
	}
	public String getSer_cod_serv4() {
		return ser_cod_serv4;
	}
	public void setSer_cod_serv4(String ser_cod_serv4) {
		this.ser_cod_serv4 = ser_cod_serv4;
	}
	public String getSer_nropar_4_1() {
		return ser_nropar_4_1;
	}
	public void setSer_nropar_4_1(String ser_nropar_4_1) {
		this.ser_nropar_4_1 = ser_nropar_4_1;
	}
	public String getSer_column4() {
		return ser_column4;
	}
	public void setSer_column4(String ser_column4) {
		this.ser_column4 = ser_column4;
	}
	public String getSer_nroord_4() {
		return ser_nroord_4;
	}
	public void setSer_nroord_4(String ser_nroord_4) {
		this.ser_nroord_4 = ser_nroord_4;
	}
	public String getSer_nroord_4_1() {
		return ser_nroord_4_1;
	}
	public void setSer_nroord_4_1(String ser_nroord_4_1) {
		this.ser_nroord_4_1 = ser_nroord_4_1;
	}
	public String getSer_saldo_M4() {
		return ser_saldo_M4;
	}
	public void setSer_saldo_M4(String ser_saldo_M4) {
		this.ser_saldo_M4 = ser_saldo_M4;
	}
	public String getSer_saldo_A4() {
		return ser_saldo_A4;
	}
	public void setSer_saldo_A4(String ser_saldo_A4) {
		this.ser_saldo_A4 = ser_saldo_A4;
	}
	public String getAdd_xser_line_5() {
		return add_xser_line_5;
	}
	public void setAdd_xser_line_5(String add_xser_line_5) {
		this.add_xser_line_5 = add_xser_line_5;
	}
	public String getSer_nropar_5() {
		return ser_nropar_5;
	}
	public void setSer_nropar_5(String ser_nropar_5) {
		this.ser_nropar_5 = ser_nropar_5;
	}
	public String getSer_cod_serv5() {
		return ser_cod_serv5;
	}
	public void setSer_cod_serv5(String ser_cod_serv5) {
		this.ser_cod_serv5 = ser_cod_serv5;
	}
	public String getSer_nropar_5_1() {
		return ser_nropar_5_1;
	}
	public void setSer_nropar_5_1(String ser_nropar_5_1) {
		this.ser_nropar_5_1 = ser_nropar_5_1;
	}
	public String getSer_column5() {
		return ser_column5;
	}
	public void setSer_column5(String ser_column5) {
		this.ser_column5 = ser_column5;
	}
	public String getSer_nroord_5() {
		return ser_nroord_5;
	}
	public void setSer_nroord_5(String ser_nroord_5) {
		this.ser_nroord_5 = ser_nroord_5;
	}
	public String getSer_nroord_5_1() {
		return ser_nroord_5_1;
	}
	public void setSer_nroord_5_1(String ser_nroord_5_1) {
		this.ser_nroord_5_1 = ser_nroord_5_1;
	}
	public String getSer_saldo_M5() {
		return ser_saldo_M5;
	}
	public void setSer_saldo_M5(String ser_saldo_M5) {
		this.ser_saldo_M5 = ser_saldo_M5;
	}
	public String getSer_saldo_A5() {
		return ser_saldo_A5;
	}
	public void setSer_saldo_A5(String ser_saldo_A5) {
		this.ser_saldo_A5 = ser_saldo_A5;
	}
	public String getAdd_xser_line_6() {
		return add_xser_line_6;
	}
	public void setAdd_xser_line_6(String add_xser_line_6) {
		this.add_xser_line_6 = add_xser_line_6;
	}
	public String getSer_nropar_6() {
		return ser_nropar_6;
	}
	public void setSer_nropar_6(String ser_nropar_6) {
		this.ser_nropar_6 = ser_nropar_6;
	}
	public String getSer_cod_serv6() {
		return ser_cod_serv6;
	}
	public void setSer_cod_serv6(String ser_cod_serv6) {
		this.ser_cod_serv6 = ser_cod_serv6;
	}
	public String getSer_nropar_6_1() {
		return ser_nropar_6_1;
	}
	public void setSer_nropar_6_1(String ser_nropar_6_1) {
		this.ser_nropar_6_1 = ser_nropar_6_1;
	}
	public String getSer_column6() {
		return ser_column6;
	}
	public void setSer_column6(String ser_column6) {
		this.ser_column6 = ser_column6;
	}
	public String getSer_nroord_6() {
		return ser_nroord_6;
	}
	public void setSer_nroord_6(String ser_nroord_6) {
		this.ser_nroord_6 = ser_nroord_6;
	}
	public String getSer_nroord_6_1() {
		return ser_nroord_6_1;
	}
	public void setSer_nroord_6_1(String ser_nroord_6_1) {
		this.ser_nroord_6_1 = ser_nroord_6_1;
	}
	public String getSer_saldo_M6() {
		return ser_saldo_M6;
	}
	public void setSer_saldo_M6(String ser_saldo_M6) {
		this.ser_saldo_M6 = ser_saldo_M6;
	}
	public String getSer_saldo_A6() {
		return ser_saldo_A6;
	}
	public void setSer_saldo_A6(String ser_saldo_A6) {
		this.ser_saldo_A6 = ser_saldo_A6;
	}
	public String getAdd_xser_line_7() {
		return add_xser_line_7;
	}
	public void setAdd_xser_line_7(String add_xser_line_7) {
		this.add_xser_line_7 = add_xser_line_7;
	}
	public String getSer_nropar_7() {
		return ser_nropar_7;
	}
	public void setSer_nropar_7(String ser_nropar_7) {
		this.ser_nropar_7 = ser_nropar_7;
	}
	public String getSer_cod_serv7() {
		return ser_cod_serv7;
	}
	public void setSer_cod_serv7(String ser_cod_serv7) {
		this.ser_cod_serv7 = ser_cod_serv7;
	}
	public String getSer_nropar_7_1() {
		return ser_nropar_7_1;
	}
	public void setSer_nropar_7_1(String ser_nropar_7_1) {
		this.ser_nropar_7_1 = ser_nropar_7_1;
	}
	public String getSer_column7() {
		return ser_column7;
	}
	public void setSer_column7(String ser_column7) {
		this.ser_column7 = ser_column7;
	}
	public String getSer_nroord_7() {
		return ser_nroord_7;
	}
	public void setSer_nroord_7(String ser_nroord_7) {
		this.ser_nroord_7 = ser_nroord_7;
	}
	public String getSer_nroord_7_1() {
		return ser_nroord_7_1;
	}
	public void setSer_nroord_7_1(String ser_nroord_7_1) {
		this.ser_nroord_7_1 = ser_nroord_7_1;
	}
	public String getSer_saldo_M7() {
		return ser_saldo_M7;
	}
	public void setSer_saldo_M7(String ser_saldo_M7) {
		this.ser_saldo_M7 = ser_saldo_M7;
	}
	public String getSer_saldo_A7() {
		return ser_saldo_A7;
	}
	public void setSer_saldo_A7(String ser_saldo_A7) {
		this.ser_saldo_A7 = ser_saldo_A7;
	}
	public String getAdd_xser_line_8() {
		return add_xser_line_8;
	}
	public void setAdd_xser_line_8(String add_xser_line_8) {
		this.add_xser_line_8 = add_xser_line_8;
	}
	public String getSer_nropar_8() {
		return ser_nropar_8;
	}
	public void setSer_nropar_8(String ser_nropar_8) {
		this.ser_nropar_8 = ser_nropar_8;
	}
	public String getSer_cod_serv8() {
		return ser_cod_serv8;
	}
	public void setSer_cod_serv8(String ser_cod_serv8) {
		this.ser_cod_serv8 = ser_cod_serv8;
	}
	public String getSer_nropar_8_1() {
		return ser_nropar_8_1;
	}
	public void setSer_nropar_8_1(String ser_nropar_8_1) {
		this.ser_nropar_8_1 = ser_nropar_8_1;
	}
	public String getSer_column8() {
		return ser_column8;
	}
	public void setSer_column8(String ser_column8) {
		this.ser_column8 = ser_column8;
	}
	public String getSer_nroord_8() {
		return ser_nroord_8;
	}
	public void setSer_nroord_8(String ser_nroord_8) {
		this.ser_nroord_8 = ser_nroord_8;
	}
	public String getSer_nroord_8_1() {
		return ser_nroord_8_1;
	}
	public void setSer_nroord_8_1(String ser_nroord_8_1) {
		this.ser_nroord_8_1 = ser_nroord_8_1;
	}
	public String getSer_saldo_M8() {
		return ser_saldo_M8;
	}
	public void setSer_saldo_M8(String ser_saldo_M8) {
		this.ser_saldo_M8 = ser_saldo_M8;
	}
	public String getSer_saldo_A8() {
		return ser_saldo_A8;
	}
	public void setSer_saldo_A8(String ser_saldo_A8) {
		this.ser_saldo_A8 = ser_saldo_A8;
	}
	public String getAdd_xser_line_9() {
		return add_xser_line_9;
	}
	public void setAdd_xser_line_9(String add_xser_line_9) {
		this.add_xser_line_9 = add_xser_line_9;
	}
	public String getSer_nropar_9() {
		return ser_nropar_9;
	}
	public void setSer_nropar_9(String ser_nropar_9) {
		this.ser_nropar_9 = ser_nropar_9;
	}
	public String getSer_cod_serv9() {
		return ser_cod_serv9;
	}
	public void setSer_cod_serv9(String ser_cod_serv9) {
		this.ser_cod_serv9 = ser_cod_serv9;
	}
	public String getSer_nropar_9_1() {
		return ser_nropar_9_1;
	}
	public void setSer_nropar_9_1(String ser_nropar_9_1) {
		this.ser_nropar_9_1 = ser_nropar_9_1;
	}
	public String getSer_column9() {
		return ser_column9;
	}
	public void setSer_column9(String ser_column9) {
		this.ser_column9 = ser_column9;
	}
	public String getSer_nroord_9() {
		return ser_nroord_9;
	}
	public void setSer_nroord_9(String ser_nroord_9) {
		this.ser_nroord_9 = ser_nroord_9;
	}
	public String getSer_nroord_9_1() {
		return ser_nroord_9_1;
	}
	public void setSer_nroord_9_1(String ser_nroord_9_1) {
		this.ser_nroord_9_1 = ser_nroord_9_1;
	}
	public String getSer_saldo_M9() {
		return ser_saldo_M9;
	}
	public void setSer_saldo_M9(String ser_saldo_M9) {
		this.ser_saldo_M9 = ser_saldo_M9;
	}
	public String getSer_saldo_A9() {
		return ser_saldo_A9;
	}
	public void setSer_saldo_A9(String ser_saldo_A9) {
		this.ser_saldo_A9 = ser_saldo_A9;
	}
	public String getAdd_xser_line_10() {
		return add_xser_line_10;
	}
	public void setAdd_xser_line_10(String add_xser_line_10) {
		this.add_xser_line_10 = add_xser_line_10;
	}
	public String getSer_nropar_10() {
		return ser_nropar_10;
	}
	public void setSer_nropar_10(String ser_nropar_10) {
		this.ser_nropar_10 = ser_nropar_10;
	}
	public String getSer_cod_serv10() {
		return ser_cod_serv10;
	}
	public void setSer_cod_serv10(String ser_cod_serv10) {
		this.ser_cod_serv10 = ser_cod_serv10;
	}
	public String getSer_nropar_10_1() {
		return ser_nropar_10_1;
	}
	public void setSer_nropar_10_1(String ser_nropar_10_1) {
		this.ser_nropar_10_1 = ser_nropar_10_1;
	}
	public String getSer_column10() {
		return ser_column10;
	}
	public void setSer_column10(String ser_column10) {
		this.ser_column10 = ser_column10;
	}
	public String getSer_nroord_10() {
		return ser_nroord_10;
	}
	public void setSer_nroord_10(String ser_nroord_10) {
		this.ser_nroord_10 = ser_nroord_10;
	}
	public String getSer_nroord_10_1() {
		return ser_nroord_10_1;
	}
	public void setSer_nroord_10_1(String ser_nroord_10_1) {
		this.ser_nroord_10_1 = ser_nroord_10_1;
	}
	public String getSer_saldo_M10() {
		return ser_saldo_M10;
	}
	public void setSer_saldo_M10(String ser_saldo_M10) {
		this.ser_saldo_M10 = ser_saldo_M10;
	}
	public String getSer_saldo_A10() {
		return ser_saldo_A10;
	}
	public void setSer_saldo_A10(String ser_saldo_A10) {
		this.ser_saldo_A10 = ser_saldo_A10;
	}
	public String getAdd_xser_line_11() {
		return add_xser_line_11;
	}
	public void setAdd_xser_line_11(String add_xser_line_11) {
		this.add_xser_line_11 = add_xser_line_11;
	}
	public String getSer_nropar_11() {
		return ser_nropar_11;
	}
	public void setSer_nropar_11(String ser_nropar_11) {
		this.ser_nropar_11 = ser_nropar_11;
	}
	public String getSer_cod_serv11() {
		return ser_cod_serv11;
	}
	public void setSer_cod_serv11(String ser_cod_serv11) {
		this.ser_cod_serv11 = ser_cod_serv11;
	}
	public String getSer_nropar_11_1() {
		return ser_nropar_11_1;
	}
	public void setSer_nropar_11_1(String ser_nropar_11_1) {
		this.ser_nropar_11_1 = ser_nropar_11_1;
	}
	public String getSer_column11() {
		return ser_column11;
	}
	public void setSer_column11(String ser_column11) {
		this.ser_column11 = ser_column11;
	}
	public String getSer_nroord_11() {
		return ser_nroord_11;
	}
	public void setSer_nroord_11(String ser_nroord_11) {
		this.ser_nroord_11 = ser_nroord_11;
	}
	public String getSer_nroord_11_1() {
		return ser_nroord_11_1;
	}
	public void setSer_nroord_11_1(String ser_nroord_11_1) {
		this.ser_nroord_11_1 = ser_nroord_11_1;
	}
	public String getSer_saldo_M11() {
		return ser_saldo_M11;
	}
	public void setSer_saldo_M11(String ser_saldo_M11) {
		this.ser_saldo_M11 = ser_saldo_M11;
	}
	public String getSer_saldo_A11() {
		return ser_saldo_A11;
	}
	public void setSer_saldo_A11(String ser_saldo_A11) {
		this.ser_saldo_A11 = ser_saldo_A11;
	}
	public String getAdd_xser_line_12() {
		return add_xser_line_12;
	}
	public void setAdd_xser_line_12(String add_xser_line_12) {
		this.add_xser_line_12 = add_xser_line_12;
	}
	public String getSer_nropar_12() {
		return ser_nropar_12;
	}
	public void setSer_nropar_12(String ser_nropar_12) {
		this.ser_nropar_12 = ser_nropar_12;
	}
	public String getSer_cod_serv12() {
		return ser_cod_serv12;
	}
	public void setSer_cod_serv12(String ser_cod_serv12) {
		this.ser_cod_serv12 = ser_cod_serv12;
	}
	public String getSer_nropar_12_1() {
		return ser_nropar_12_1;
	}
	public void setSer_nropar_12_1(String ser_nropar_12_1) {
		this.ser_nropar_12_1 = ser_nropar_12_1;
	}
	public String getSer_column12() {
		return ser_column12;
	}
	public void setSer_column12(String ser_column12) {
		this.ser_column12 = ser_column12;
	}
	public String getSer_nroord_12() {
		return ser_nroord_12;
	}
	public void setSer_nroord_12(String ser_nroord_12) {
		this.ser_nroord_12 = ser_nroord_12;
	}
	public String getSer_nroord_12_1() {
		return ser_nroord_12_1;
	}
	public void setSer_nroord_12_1(String ser_nroord_12_1) {
		this.ser_nroord_12_1 = ser_nroord_12_1;
	}
	public String getSer_saldo_M12() {
		return ser_saldo_M12;
	}
	public void setSer_saldo_M12(String ser_saldo_M12) {
		this.ser_saldo_M12 = ser_saldo_M12;
	}
	public String getSer_saldo_A12() {
		return ser_saldo_A12;
	}
	public void setSer_saldo_A12(String ser_saldo_A12) {
		this.ser_saldo_A12 = ser_saldo_A12;
	}
	public String getAdd_xser_line_13() {
		return add_xser_line_13;
	}
	public void setAdd_xser_line_13(String add_xser_line_13) {
		this.add_xser_line_13 = add_xser_line_13;
	}
	public String getSer_nropar_13() {
		return ser_nropar_13;
	}
	public void setSer_nropar_13(String ser_nropar_13) {
		this.ser_nropar_13 = ser_nropar_13;
	}
	public String getSer_cod_serv13() {
		return ser_cod_serv13;
	}
	public void setSer_cod_serv13(String ser_cod_serv13) {
		this.ser_cod_serv13 = ser_cod_serv13;
	}
	public String getSer_nropar_13_1() {
		return ser_nropar_13_1;
	}
	public void setSer_nropar_13_1(String ser_nropar_13_1) {
		this.ser_nropar_13_1 = ser_nropar_13_1;
	}
	public String getSer_column13() {
		return ser_column13;
	}
	public void setSer_column13(String ser_column13) {
		this.ser_column13 = ser_column13;
	}
	public String getSer_nroord_13() {
		return ser_nroord_13;
	}
	public void setSer_nroord_13(String ser_nroord_13) {
		this.ser_nroord_13 = ser_nroord_13;
	}
	public String getSer_nroord_13_1() {
		return ser_nroord_13_1;
	}
	public void setSer_nroord_13_1(String ser_nroord_13_1) {
		this.ser_nroord_13_1 = ser_nroord_13_1;
	}
	public String getSer_saldo_M13() {
		return ser_saldo_M13;
	}
	public void setSer_saldo_M13(String ser_saldo_M13) {
		this.ser_saldo_M13 = ser_saldo_M13;
	}
	public String getSer_saldo_A13() {
		return ser_saldo_A13;
	}
	public void setSer_saldo_A13(String ser_saldo_A13) {
		this.ser_saldo_A13 = ser_saldo_A13;
	}
	public String getAdd_xser_line_14() {
		return add_xser_line_14;
	}
	public void setAdd_xser_line_14(String add_xser_line_14) {
		this.add_xser_line_14 = add_xser_line_14;
	}
	public String getSer_nropar_14() {
		return ser_nropar_14;
	}
	public void setSer_nropar_14(String ser_nropar_14) {
		this.ser_nropar_14 = ser_nropar_14;
	}
	public String getSer_cod_serv14() {
		return ser_cod_serv14;
	}
	public void setSer_cod_serv14(String ser_cod_serv14) {
		this.ser_cod_serv14 = ser_cod_serv14;
	}
	public String getSer_nropar_14_1() {
		return ser_nropar_14_1;
	}
	public void setSer_nropar_14_1(String ser_nropar_14_1) {
		this.ser_nropar_14_1 = ser_nropar_14_1;
	}
	public String getSer_column14() {
		return ser_column14;
	}
	public void setSer_column14(String ser_column14) {
		this.ser_column14 = ser_column14;
	}
	public String getSer_nroord_14() {
		return ser_nroord_14;
	}
	public void setSer_nroord_14(String ser_nroord_14) {
		this.ser_nroord_14 = ser_nroord_14;
	}
	public String getSer_nroord_14_1() {
		return ser_nroord_14_1;
	}
	public void setSer_nroord_14_1(String ser_nroord_14_1) {
		this.ser_nroord_14_1 = ser_nroord_14_1;
	}
	public String getSer_saldo_M14() {
		return ser_saldo_M14;
	}
	public void setSer_saldo_M14(String ser_saldo_M14) {
		this.ser_saldo_M14 = ser_saldo_M14;
	}
	public String getSer_saldo_A14() {
		return ser_saldo_A14;
	}
	public void setSer_saldo_A14(String ser_saldo_A14) {
		this.ser_saldo_A14 = ser_saldo_A14;
	}
	public String getAdd_xser_line_15() {
		return add_xser_line_15;
	}
	public void setAdd_xser_line_15(String add_xser_line_15) {
		this.add_xser_line_15 = add_xser_line_15;
	}
	public String getSer_nropar_15() {
		return ser_nropar_15;
	}
	public void setSer_nropar_15(String ser_nropar_15) {
		this.ser_nropar_15 = ser_nropar_15;
	}
	public String getSer_cod_serv15() {
		return ser_cod_serv15;
	}
	public void setSer_cod_serv15(String ser_cod_serv15) {
		this.ser_cod_serv15 = ser_cod_serv15;
	}
	public String getSer_nropar_15_1() {
		return ser_nropar_15_1;
	}
	public void setSer_nropar_15_1(String ser_nropar_15_1) {
		this.ser_nropar_15_1 = ser_nropar_15_1;
	}
	public String getSer_column15() {
		return ser_column15;
	}
	public void setSer_column15(String ser_column15) {
		this.ser_column15 = ser_column15;
	}
	public String getSer_nroord_15() {
		return ser_nroord_15;
	}
	public void setSer_nroord_15(String ser_nroord_15) {
		this.ser_nroord_15 = ser_nroord_15;
	}
	public String getSer_nroord_15_1() {
		return ser_nroord_15_1;
	}
	public void setSer_nroord_15_1(String ser_nroord_15_1) {
		this.ser_nroord_15_1 = ser_nroord_15_1;
	}
	public String getSer_saldo_M15() {
		return ser_saldo_M15;
	}
	public void setSer_saldo_M15(String ser_saldo_M15) {
		this.ser_saldo_M15 = ser_saldo_M15;
	}
	public String getSer_saldo_A15() {
		return ser_saldo_A15;
	}
	public void setSer_saldo_A15(String ser_saldo_A15) {
		this.ser_saldo_A15 = ser_saldo_A15;
	}
	public String getSfd() {
		return sfd;
	}
	public void setSfd(String sfd) {
		this.sfd = sfd;
	}
	public String getBond_non_po() {
		return bond_non_po;
	}
	public void setBond_non_po(String bond_non_po) {
		this.bond_non_po = bond_non_po;
	}
	public String getDivision_MEX() {
		return division_MEX;
	}
	public void setDivision_MEX(String division_MEX) {
		this.division_MEX = division_MEX;
	}
	public String getDivision_BRA() {
		return division_BRA;
	}
	public void setDivision_BRA(String division_BRA) {
		this.division_BRA = division_BRA;
	}
	public String getDivision_SSA() {
		return division_SSA;
	}
	public void setDivision_SSA(String division_SSA) {
		this.division_SSA = division_SSA;
	}
	public String getProd_cat_ITS_BRA() {
		return prod_cat_ITS_BRA;
	}
	public void setProd_cat_ITS_BRA(String prod_cat_ITS_BRA) {
		this.prod_cat_ITS_BRA = prod_cat_ITS_BRA;
	}
	public String getProd_cat_ITMX_SSA_M1() {
		return prod_cat_ITMX_SSA_M1;
	}
	public void setProd_cat_ITMX_SSA_M1(String prod_cat_ITMX_SSA_M1) {
		this.prod_cat_ITMX_SSA_M1 = prod_cat_ITMX_SSA_M1;
	}
	public String getProd_cat_ITMX_SSA_A1() {
		return prod_cat_ITMX_SSA_A1;
	}
	public void setProd_cat_ITMX_SSA_A1(String prod_cat_ITMX_SSA_A1) {
		this.prod_cat_ITMX_SSA_A1 = prod_cat_ITMX_SSA_A1;
	}
	public String getProd_cat_ITMX_SSA_M2() {
		return prod_cat_ITMX_SSA_M2;
	}
	public void setProd_cat_ITMX_SSA_M2(String prod_cat_ITMX_SSA_M2) {
		this.prod_cat_ITMX_SSA_M2 = prod_cat_ITMX_SSA_M2;
	}
	public String getProd_cat_ITMX_SSA_A2() {
		return prod_cat_ITMX_SSA_A2;
	}
	public void setProd_cat_ITMX_SSA_A2(String prod_cat_ITMX_SSA_A2) {
		this.prod_cat_ITMX_SSA_A2 = prod_cat_ITMX_SSA_A2;
	}
	public String getProd_cat_ITMX_SSA_M3() {
		return prod_cat_ITMX_SSA_M3;
	}
	public void setProd_cat_ITMX_SSA_M3(String prod_cat_ITMX_SSA_M3) {
		this.prod_cat_ITMX_SSA_M3 = prod_cat_ITMX_SSA_M3;
	}
	public String getProd_cat_ITMX_SSA_A3() {
		return prod_cat_ITMX_SSA_A3;
	}
	public void setProd_cat_ITMX_SSA_A3(String prod_cat_ITMX_SSA_A3) {
		this.prod_cat_ITMX_SSA_A3 = prod_cat_ITMX_SSA_A3;
	}
	public String getProd_cat_ITMX_SSA_M4() {
		return prod_cat_ITMX_SSA_M4;
	}
	public void setProd_cat_ITMX_SSA_M4(String prod_cat_ITMX_SSA_M4) {
		this.prod_cat_ITMX_SSA_M4 = prod_cat_ITMX_SSA_M4;
	}
	public String getProd_cat_ITMX_SSA_A4() {
		return prod_cat_ITMX_SSA_A4;
	}
	public void setProd_cat_ITMX_SSA_A4(String prod_cat_ITMX_SSA_A4) {
		this.prod_cat_ITMX_SSA_A4 = prod_cat_ITMX_SSA_A4;
	}
	public String getProd_cat_ITMX_SSA_M5() {
		return prod_cat_ITMX_SSA_M5;
	}
	public void setProd_cat_ITMX_SSA_M5(String prod_cat_ITMX_SSA_M5) {
		this.prod_cat_ITMX_SSA_M5 = prod_cat_ITMX_SSA_M5;
	}
	public String getProd_cat_ITMX_SSA_A5() {
		return prod_cat_ITMX_SSA_A5;
	}
	public void setProd_cat_ITMX_SSA_A5(String prod_cat_ITMX_SSA_A5) {
		this.prod_cat_ITMX_SSA_A5 = prod_cat_ITMX_SSA_A5;
	}
	public String getProd_cat_ITMX_SSA_M6() {
		return prod_cat_ITMX_SSA_M6;
	}
	public void setProd_cat_ITMX_SSA_M6(String prod_cat_ITMX_SSA_M6) {
		this.prod_cat_ITMX_SSA_M6 = prod_cat_ITMX_SSA_M6;
	}
	public String getProd_cat_ITMX_SSA_A6() {
		return prod_cat_ITMX_SSA_A6;
	}
	public void setProd_cat_ITMX_SSA_A6(String prod_cat_ITMX_SSA_A6) {
		this.prod_cat_ITMX_SSA_A6 = prod_cat_ITMX_SSA_A6;
	}
	public String getProd_cat_ITMX_SSA_M7() {
		return prod_cat_ITMX_SSA_M7;
	}
	public void setProd_cat_ITMX_SSA_M7(String prod_cat_ITMX_SSA_M7) {
		this.prod_cat_ITMX_SSA_M7 = prod_cat_ITMX_SSA_M7;
	}
	public String getProd_cat_ITMX_SSA_A7() {
		return prod_cat_ITMX_SSA_A7;
	}
	public void setProd_cat_ITMX_SSA_A7(String prod_cat_ITMX_SSA_A7) {
		this.prod_cat_ITMX_SSA_A7 = prod_cat_ITMX_SSA_A7;
	}
	public String getProd_cat_ITMX_SSA_M8() {
		return prod_cat_ITMX_SSA_M8;
	}
	public void setProd_cat_ITMX_SSA_M8(String prod_cat_ITMX_SSA_M8) {
		this.prod_cat_ITMX_SSA_M8 = prod_cat_ITMX_SSA_M8;
	}
	public String getProd_cat_ITMX_SSA_A8() {
		return prod_cat_ITMX_SSA_A8;
	}
	public void setProd_cat_ITMX_SSA_A8(String prod_cat_ITMX_SSA_A8) {
		this.prod_cat_ITMX_SSA_A8 = prod_cat_ITMX_SSA_A8;
	}
	public String getProd_cat_ITMX_SSA_M9() {
		return prod_cat_ITMX_SSA_M9;
	}
	public void setProd_cat_ITMX_SSA_M9(String prod_cat_ITMX_SSA_M9) {
		this.prod_cat_ITMX_SSA_M9 = prod_cat_ITMX_SSA_M9;
	}
	public String getProd_cat_ITMX_SSA_A9() {
		return prod_cat_ITMX_SSA_A9;
	}
	public void setProd_cat_ITMX_SSA_A9(String prod_cat_ITMX_SSA_A9) {
		this.prod_cat_ITMX_SSA_A9 = prod_cat_ITMX_SSA_A9;
	}
	public String getProd_cat_ITMX_SSA_M10() {
		return prod_cat_ITMX_SSA_M10;
	}
	public void setProd_cat_ITMX_SSA_M10(String prod_cat_ITMX_SSA_M10) {
		this.prod_cat_ITMX_SSA_M10 = prod_cat_ITMX_SSA_M10;
	}
	public String getProd_cat_ITMX_SSA_A10() {
		return prod_cat_ITMX_SSA_A10;
	}
	public void setProd_cat_ITMX_SSA_A10(String prod_cat_ITMX_SSA_A10) {
		this.prod_cat_ITMX_SSA_A10 = prod_cat_ITMX_SSA_A10;
	}
	public String getProd_cat_ITMX_SSA_M11() {
		return prod_cat_ITMX_SSA_M11;
	}
	public void setProd_cat_ITMX_SSA_M11(String prod_cat_ITMX_SSA_M11) {
		this.prod_cat_ITMX_SSA_M11 = prod_cat_ITMX_SSA_M11;
	}
	public String getProd_cat_ITMX_SSA_A11() {
		return prod_cat_ITMX_SSA_A11;
	}
	public void setProd_cat_ITMX_SSA_A11(String prod_cat_ITMX_SSA_A11) {
		this.prod_cat_ITMX_SSA_A11 = prod_cat_ITMX_SSA_A11;
	}
	public String getProd_cat_ITMX_SSA_M12() {
		return prod_cat_ITMX_SSA_M12;
	}
	public void setProd_cat_ITMX_SSA_M12(String prod_cat_ITMX_SSA_M12) {
		this.prod_cat_ITMX_SSA_M12 = prod_cat_ITMX_SSA_M12;
	}
	public String getProd_cat_ITMX_SSA_A12() {
		return prod_cat_ITMX_SSA_A12;
	}
	public void setProd_cat_ITMX_SSA_A12(String prod_cat_ITMX_SSA_A12) {
		this.prod_cat_ITMX_SSA_A12 = prod_cat_ITMX_SSA_A12;
	}
	public String getProd_cat_ITMX_SSA_M13() {
		return prod_cat_ITMX_SSA_M13;
	}
	public void setProd_cat_ITMX_SSA_M13(String prod_cat_ITMX_SSA_M13) {
		this.prod_cat_ITMX_SSA_M13 = prod_cat_ITMX_SSA_M13;
	}
	public String getProd_cat_ITMX_SSA_A13() {
		return prod_cat_ITMX_SSA_A13;
	}
	public void setProd_cat_ITMX_SSA_A13(String prod_cat_ITMX_SSA_A13) {
		this.prod_cat_ITMX_SSA_A13 = prod_cat_ITMX_SSA_A13;
	}
	public String getProd_cat_ITMX_SSA_M14() {
		return prod_cat_ITMX_SSA_M14;
	}
	public void setProd_cat_ITMX_SSA_M14(String prod_cat_ITMX_SSA_M14) {
		this.prod_cat_ITMX_SSA_M14 = prod_cat_ITMX_SSA_M14;
	}
	public String getProd_cat_ITMX_SSA_A14() {
		return prod_cat_ITMX_SSA_A14;
	}
	public void setProd_cat_ITMX_SSA_A14(String prod_cat_ITMX_SSA_A14) {
		this.prod_cat_ITMX_SSA_A14 = prod_cat_ITMX_SSA_A14;
	}
	public String getProd_cat_ITMX_SSA_M15() {
		return prod_cat_ITMX_SSA_M15;
	}
	public void setProd_cat_ITMX_SSA_M15(String prod_cat_ITMX_SSA_M15) {
		this.prod_cat_ITMX_SSA_M15 = prod_cat_ITMX_SSA_M15;
	}
	public String getProd_cat_ITMX_SSA_A15() {
		return prod_cat_ITMX_SSA_A15;
	}
	public void setProd_cat_ITMX_SSA_A15(String prod_cat_ITMX_SSA_A15) {
		this.prod_cat_ITMX_SSA_A15 = prod_cat_ITMX_SSA_A15;
	}
	public String getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}
	public String getMajor_SO_MEX() {
		return major_SO_MEX;
	}
	public void setMajor_SO_MEX(String major_SO_MEX) {
		this.major_SO_MEX = major_SO_MEX;
	}
	public String getMajor_SO_CHI() {
		return major_SO_CHI;
	}
	public void setMajor_SO_CHI(String major_SO_CHI) {
		this.major_SO_CHI = major_SO_CHI;
	}
	public String getMajor_SO_COL() {
		return major_SO_COL;
	}
	public void setMajor_SO_COL(String major_SO_COL) {
		this.major_SO_COL = major_SO_COL;
	}
	public String getMajor_SO_VEN() {
		return major_SO_VEN;
	}
	public void setMajor_SO_VEN(String major_SO_VEN) {
		this.major_SO_VEN = major_SO_VEN;
	}
	public String getMajor_SO_PER() {
		return major_SO_PER;
	}
	public void setMajor_SO_PER(String major_SO_PER) {
		this.major_SO_PER = major_SO_PER;
	}
	public String getMajor_SO_SSA() {
		return major_SO_SSA;
	}
	public void setMajor_SO_SSA(String major_SO_SSA) {
		this.major_SO_SSA = major_SO_SSA;
	}
	public String getMajor_SO_BRA() {
		return major_SO_BRA;
	}
	public void setMajor_SO_BRA(String major_SO_BRA) {
		this.major_SO_BRA = major_SO_BRA;
	}
	public String getMajor_MRX_BRA() {
		return major_MRX_BRA;
	}
	public void setMajor_MRX_BRA(String major_MRX_BRA) {
		this.major_MRX_BRA = major_MRX_BRA;
	}
	public String getMajor_ITS_BRA() {
		return major_ITS_BRA;
	}
	public void setMajor_ITS_BRA(String major_ITS_BRA) {
		this.major_ITS_BRA = major_ITS_BRA;
	}
	public String getMajor_ITSMRX_SSA_M1() {
		return major_ITSMRX_SSA_M1;
	}
	public void setMajor_ITSMRX_SSA_M1(String major_ITSMRX_SSA_M1) {
		this.major_ITSMRX_SSA_M1 = major_ITSMRX_SSA_M1;
	}
	public String getMajor_ITSMRX_SSA_A1() {
		return major_ITSMRX_SSA_A1;
	}
	public void setMajor_ITSMRX_SSA_A1(String major_ITSMRX_SSA_A1) {
		this.major_ITSMRX_SSA_A1 = major_ITSMRX_SSA_A1;
	}
	public String getMajor_ITSMRX_SSA_M2() {
		return major_ITSMRX_SSA_M2;
	}
	public void setMajor_ITSMRX_SSA_M2(String major_ITSMRX_SSA_M2) {
		this.major_ITSMRX_SSA_M2 = major_ITSMRX_SSA_M2;
	}
	public String getMajor_ITSMRX_SSA_A2() {
		return major_ITSMRX_SSA_A2;
	}
	public void setMajor_ITSMRX_SSA_A2(String major_ITSMRX_SSA_A2) {
		this.major_ITSMRX_SSA_A2 = major_ITSMRX_SSA_A2;
	}
	public String getMajor_ITSMRX_SSA_M3() {
		return major_ITSMRX_SSA_M3;
	}
	public void setMajor_ITSMRX_SSA_M3(String major_ITSMRX_SSA_M3) {
		this.major_ITSMRX_SSA_M3 = major_ITSMRX_SSA_M3;
	}
	public String getMajor_ITSMRX_SSA_A3() {
		return major_ITSMRX_SSA_A3;
	}
	public void setMajor_ITSMRX_SSA_A3(String major_ITSMRX_SSA_A3) {
		this.major_ITSMRX_SSA_A3 = major_ITSMRX_SSA_A3;
	}
	public String getMajor_ITSMRX_SSA_M4() {
		return major_ITSMRX_SSA_M4;
	}
	public void setMajor_ITSMRX_SSA_M4(String major_ITSMRX_SSA_M4) {
		this.major_ITSMRX_SSA_M4 = major_ITSMRX_SSA_M4;
	}
	public String getMajor_ITSMRX_SSA_A4() {
		return major_ITSMRX_SSA_A4;
	}
	public void setMajor_ITSMRX_SSA_A4(String major_ITSMRX_SSA_A4) {
		this.major_ITSMRX_SSA_A4 = major_ITSMRX_SSA_A4;
	}
	public String getMajor_ITSMRX_SSA_M5() {
		return major_ITSMRX_SSA_M5;
	}
	public void setMajor_ITSMRX_SSA_M5(String major_ITSMRX_SSA_M5) {
		this.major_ITSMRX_SSA_M5 = major_ITSMRX_SSA_M5;
	}
	public String getMajor_ITSMRX_SSA_A5() {
		return major_ITSMRX_SSA_A5;
	}
	public void setMajor_ITSMRX_SSA_A5(String major_ITSMRX_SSA_A5) {
		this.major_ITSMRX_SSA_A5 = major_ITSMRX_SSA_A5;
	}
	public String getMajor_ITSMRX_SSA_M6() {
		return major_ITSMRX_SSA_M6;
	}
	public void setMajor_ITSMRX_SSA_M6(String major_ITSMRX_SSA_M6) {
		this.major_ITSMRX_SSA_M6 = major_ITSMRX_SSA_M6;
	}
	public String getMajor_ITSMRX_SSA_A6() {
		return major_ITSMRX_SSA_A6;
	}
	public void setMajor_ITSMRX_SSA_A6(String major_ITSMRX_SSA_A6) {
		this.major_ITSMRX_SSA_A6 = major_ITSMRX_SSA_A6;
	}
	public String getMajor_ITSMRX_SSA_M7() {
		return major_ITSMRX_SSA_M7;
	}
	public void setMajor_ITSMRX_SSA_M7(String major_ITSMRX_SSA_M7) {
		this.major_ITSMRX_SSA_M7 = major_ITSMRX_SSA_M7;
	}
	public String getMajor_ITSMRX_SSA_A7() {
		return major_ITSMRX_SSA_A7;
	}
	public void setMajor_ITSMRX_SSA_A7(String major_ITSMRX_SSA_A7) {
		this.major_ITSMRX_SSA_A7 = major_ITSMRX_SSA_A7;
	}
	public String getMajor_ITSMRX_SSA_M8() {
		return major_ITSMRX_SSA_M8;
	}
	public void setMajor_ITSMRX_SSA_M8(String major_ITSMRX_SSA_M8) {
		this.major_ITSMRX_SSA_M8 = major_ITSMRX_SSA_M8;
	}
	public String getMajor_ITSMRX_SSA_A8() {
		return major_ITSMRX_SSA_A8;
	}
	public void setMajor_ITSMRX_SSA_A8(String major_ITSMRX_SSA_A8) {
		this.major_ITSMRX_SSA_A8 = major_ITSMRX_SSA_A8;
	}
	public String getMajor_ITSMRX_SSA_M9() {
		return major_ITSMRX_SSA_M9;
	}
	public void setMajor_ITSMRX_SSA_M9(String major_ITSMRX_SSA_M9) {
		this.major_ITSMRX_SSA_M9 = major_ITSMRX_SSA_M9;
	}
	public String getMajor_ITSMRX_SSA_A9() {
		return major_ITSMRX_SSA_A9;
	}
	public void setMajor_ITSMRX_SSA_A9(String major_ITSMRX_SSA_A9) {
		this.major_ITSMRX_SSA_A9 = major_ITSMRX_SSA_A9;
	}
	public String getMajor_ITSMRX_SSA_M10() {
		return major_ITSMRX_SSA_M10;
	}
	public void setMajor_ITSMRX_SSA_M10(String major_ITSMRX_SSA_M10) {
		this.major_ITSMRX_SSA_M10 = major_ITSMRX_SSA_M10;
	}
	public String getMajor_ITSMRX_SSA_A10() {
		return major_ITSMRX_SSA_A10;
	}
	public void setMajor_ITSMRX_SSA_A10(String major_ITSMRX_SSA_A10) {
		this.major_ITSMRX_SSA_A10 = major_ITSMRX_SSA_A10;
	}
	public String getMajor_ITSMRX_SSA_M11() {
		return major_ITSMRX_SSA_M11;
	}
	public void setMajor_ITSMRX_SSA_M11(String major_ITSMRX_SSA_M11) {
		this.major_ITSMRX_SSA_M11 = major_ITSMRX_SSA_M11;
	}
	public String getMajor_ITSMRX_SSA_A11() {
		return major_ITSMRX_SSA_A11;
	}
	public void setMajor_ITSMRX_SSA_A11(String major_ITSMRX_SSA_A11) {
		this.major_ITSMRX_SSA_A11 = major_ITSMRX_SSA_A11;
	}
	public String getMajor_ITSMRX_SSA_M12() {
		return major_ITSMRX_SSA_M12;
	}
	public void setMajor_ITSMRX_SSA_M12(String major_ITSMRX_SSA_M12) {
		this.major_ITSMRX_SSA_M12 = major_ITSMRX_SSA_M12;
	}
	public String getMajor_ITSMRX_SSA_A12() {
		return major_ITSMRX_SSA_A12;
	}
	public void setMajor_ITSMRX_SSA_A12(String major_ITSMRX_SSA_A12) {
		this.major_ITSMRX_SSA_A12 = major_ITSMRX_SSA_A12;
	}
	public String getMajor_ITSMRX_SSA_M13() {
		return major_ITSMRX_SSA_M13;
	}
	public void setMajor_ITSMRX_SSA_M13(String major_ITSMRX_SSA_M13) {
		this.major_ITSMRX_SSA_M13 = major_ITSMRX_SSA_M13;
	}
	public String getMajor_ITSMRX_SSA_A13() {
		return major_ITSMRX_SSA_A13;
	}
	public void setMajor_ITSMRX_SSA_A13(String major_ITSMRX_SSA_A13) {
		this.major_ITSMRX_SSA_A13 = major_ITSMRX_SSA_A13;
	}
	public String getMajor_ITSMRX_SSA_M14() {
		return major_ITSMRX_SSA_M14;
	}
	public void setMajor_ITSMRX_SSA_M14(String major_ITSMRX_SSA_M14) {
		this.major_ITSMRX_SSA_M14 = major_ITSMRX_SSA_M14;
	}
	public String getMajor_ITSMRX_SSA_A14() {
		return major_ITSMRX_SSA_A14;
	}
	public void setMajor_ITSMRX_SSA_A14(String major_ITSMRX_SSA_A14) {
		this.major_ITSMRX_SSA_A14 = major_ITSMRX_SSA_A14;
	}
	public String getMajor_ITSMRX_SSA_M15() {
		return major_ITSMRX_SSA_M15;
	}
	public void setMajor_ITSMRX_SSA_M15(String major_ITSMRX_SSA_M15) {
		this.major_ITSMRX_SSA_M15 = major_ITSMRX_SSA_M15;
	}
	public String getMajor_ITSMRX_SSA_A15() {
		return major_ITSMRX_SSA_A15;
	}
	public void setMajor_ITSMRX_SSA_A15(String major_ITSMRX_SSA_A15) {
		this.major_ITSMRX_SSA_A15 = major_ITSMRX_SSA_A15;
	}
	public String getCost_center_SO_MEX() {
		return cost_center_SO_MEX;
	}
	public void setCost_center_SO_MEX(String cost_center_SO_MEX) {
		this.cost_center_SO_MEX = cost_center_SO_MEX;
	}
	public String getCost_center_MRX_ITS_MEX() {
		return cost_center_MRX_ITS_MEX;
	}
	public void setCost_center_MRX_ITS_MEX(String cost_center_MRX_ITS_MEX) {
		this.cost_center_MRX_ITS_MEX = cost_center_MRX_ITS_MEX;
	}
	public String getCost_center_BRA_SSA() {
		return cost_center_BRA_SSA;
	}
	public void setCost_center_BRA_SSA(String cost_center_BRA_SSA) {
		this.cost_center_BRA_SSA = cost_center_BRA_SSA;
	}
	public String getWork_number_1() {
		return work_number_1;
	}
	public void setWork_number_1(String work_number_1) {
		this.work_number_1 = work_number_1;
	}
	public String getWork_number_auto_1() {
		return work_number_auto_1;
	}
	public void setWork_number_auto_1(String work_number_auto_1) {
		this.work_number_auto_1 = work_number_auto_1;
	}
	public String getComment_work_number_2() {
		return comment_work_number_2;
	}
	public void setComment_work_number_2(String comment_work_number_2) {
		this.comment_work_number_2 = comment_work_number_2;
	}
	public String getAdd_work_number_3() {
		return add_work_number_3;
	}
	public void setAdd_work_number_3(String add_work_number_3) {
		this.add_work_number_3 = add_work_number_3;
	}
	public String getWork_number_3() {
		return work_number_3;
	}
	public void setWork_number_3(String work_number_3) {
		this.work_number_3 = work_number_3;
	}
	public String getWork_number_auto_3() {
		return work_number_auto_3;
	}
	public void setWork_number_auto_3(String work_number_auto_3) {
		this.work_number_auto_3 = work_number_auto_3;
	}
	public String getComment_work_number_3() {
		return comment_work_number_3;
	}
	public void setComment_work_number_3(String comment_work_number_3) {
		this.comment_work_number_3 = comment_work_number_3;
	}
	public String getAdd_work_number_4() {
		return add_work_number_4;
	}
	public void setAdd_work_number_4(String add_work_number_4) {
		this.add_work_number_4 = add_work_number_4;
	}
	public String getWork_number_4() {
		return work_number_4;
	}
	public void setWork_number_4(String work_number_4) {
		this.work_number_4 = work_number_4;
	}
	public String getWork_number_auto_4() {
		return work_number_auto_4;
	}
	public void setWork_number_auto_4(String work_number_auto_4) {
		this.work_number_auto_4 = work_number_auto_4;
	}
	public String getComment_work_number_4() {
		return comment_work_number_4;
	}
	public void setComment_work_number_4(String comment_work_number_4) {
		this.comment_work_number_4 = comment_work_number_4;
	}
	public String getAdd_work_number_5() {
		return add_work_number_5;
	}
	public void setAdd_work_number_5(String add_work_number_5) {
		this.add_work_number_5 = add_work_number_5;
	}
	public String getWork_number_5() {
		return work_number_5;
	}
	public void setWork_number_5(String work_number_5) {
		this.work_number_5 = work_number_5;
	}
	public String getWork_number_auto_5() {
		return work_number_auto_5;
	}
	public void setWork_number_auto_5(String work_number_auto_5) {
		this.work_number_auto_5 = work_number_auto_5;
	}
	public String getComment_work_number_5() {
		return comment_work_number_5;
	}
	public void setComment_work_number_5(String comment_work_number_5) {
		this.comment_work_number_5 = comment_work_number_5;
	}
	public String getAdd_work_number_6() {
		return add_work_number_6;
	}
	public void setAdd_work_number_6(String add_work_number_6) {
		this.add_work_number_6 = add_work_number_6;
	}
	public String getWork_number_6() {
		return work_number_6;
	}
	public void setWork_number_6(String work_number_6) {
		this.work_number_6 = work_number_6;
	}
	public String getWork_number_auto_6() {
		return work_number_auto_6;
	}
	public void setWork_number_auto_6(String work_number_auto_6) {
		this.work_number_auto_6 = work_number_auto_6;
	}
	public String getComment_work_number_6() {
		return comment_work_number_6;
	}
	public void setComment_work_number_6(String comment_work_number_6) {
		this.comment_work_number_6 = comment_work_number_6;
	}
	public String getAdd_work_number_7() {
		return add_work_number_7;
	}
	public void setAdd_work_number_7(String add_work_number_7) {
		this.add_work_number_7 = add_work_number_7;
	}
	public String getWork_number_8() {
		return work_number_8;
	}
	public void setWork_number_8(String work_number_8) {
		this.work_number_8 = work_number_8;
	}
	public String getWork_number_auto_8() {
		return work_number_auto_8;
	}
	public void setWork_number_auto_8(String work_number_auto_8) {
		this.work_number_auto_8 = work_number_auto_8;
	}
	public String getComment_work_number_8() {
		return comment_work_number_8;
	}
	public void setComment_work_number_8(String comment_work_number_8) {
		this.comment_work_number_8 = comment_work_number_8;
	}
	public String getAdd_work_number_9() {
		return add_work_number_9;
	}
	public void setAdd_work_number_9(String add_work_number_9) {
		this.add_work_number_9 = add_work_number_9;
	}
	public String getWork_number_9() {
		return work_number_9;
	}
	public void setWork_number_9(String work_number_9) {
		this.work_number_9 = work_number_9;
	}
	public String getWork_number_auto_9() {
		return work_number_auto_9;
	}
	public void setWork_number_auto_9(String work_number_auto_9) {
		this.work_number_auto_9 = work_number_auto_9;
	}
	public String getComment_work_number_9() {
		return comment_work_number_9;
	}
	public void setComment_work_number_9(String comment_work_number_9) {
		this.comment_work_number_9 = comment_work_number_9;
	}
	public String getAdd_work_number_10() {
		return add_work_number_10;
	}
	public void setAdd_work_number_10(String add_work_number_10) {
		this.add_work_number_10 = add_work_number_10;
	}
	public String getWork_number_10() {
		return work_number_10;
	}
	public void setWork_number_10(String work_number_10) {
		this.work_number_10 = work_number_10;
	}
	public String getWork_number_auto_10() {
		return work_number_auto_10;
	}
	public void setWork_number_auto_10(String work_number_auto_10) {
		this.work_number_auto_10 = work_number_auto_10;
	}
	public String getComment_work_number_10() {
		return comment_work_number_10;
	}
	public void setComment_work_number_10(String comment_work_number_10) {
		this.comment_work_number_10 = comment_work_number_10;
	}
	public String getAdd_work_number_11() {
		return add_work_number_11;
	}
	public void setAdd_work_number_11(String add_work_number_11) {
		this.add_work_number_11 = add_work_number_11;
	}
	public String getWork_number_11() {
		return work_number_11;
	}
	public void setWork_number_11(String work_number_11) {
		this.work_number_11 = work_number_11;
	}
	public String getWork_number_auto_11() {
		return work_number_auto_11;
	}
	public void setWork_number_auto_11(String work_number_auto_11) {
		this.work_number_auto_11 = work_number_auto_11;
	}
	public String getComment_work_number_11() {
		return comment_work_number_11;
	}
	public void setComment_work_number_11(String comment_work_number_11) {
		this.comment_work_number_11 = comment_work_number_11;
	}
	public String getAdd_work_number_12() {
		return add_work_number_12;
	}
	public void setAdd_work_number_12(String add_work_number_12) {
		this.add_work_number_12 = add_work_number_12;
	}
	public String getWork_number_12() {
		return work_number_12;
	}
	public void setWork_number_12(String work_number_12) {
		this.work_number_12 = work_number_12;
	}
	public String getWork_number_auto_12() {
		return work_number_auto_12;
	}
	public void setWork_number_auto_12(String work_number_auto_12) {
		this.work_number_auto_12 = work_number_auto_12;
	}
	public String getComment_work_number_12() {
		return comment_work_number_12;
	}
	public void setComment_work_number_12(String comment_work_number_12) {
		this.comment_work_number_12 = comment_work_number_12;
	}
	public String getAdd_work_number_13() {
		return add_work_number_13;
	}
	public void setAdd_work_number_13(String add_work_number_13) {
		this.add_work_number_13 = add_work_number_13;
	}
	public String getWork_number_13() {
		return work_number_13;
	}
	public void setWork_number_13(String work_number_13) {
		this.work_number_13 = work_number_13;
	}
	public String getWork_number_auto_13() {
		return work_number_auto_13;
	}
	public void setWork_number_auto_13(String work_number_auto_13) {
		this.work_number_auto_13 = work_number_auto_13;
	}
	public String getComment_work_number_13() {
		return comment_work_number_13;
	}
	public void setComment_work_number_13(String comment_work_number_13) {
		this.comment_work_number_13 = comment_work_number_13;
	}
	public String getAdd_work_number_14() {
		return add_work_number_14;
	}
	public void setAdd_work_number_14(String add_work_number_14) {
		this.add_work_number_14 = add_work_number_14;
	}
	public String getWork_number_14() {
		return work_number_14;
	}
	public void setWork_number_14(String work_number_14) {
		this.work_number_14 = work_number_14;
	}
	public String getWork_number_auto_14() {
		return work_number_auto_14;
	}
	public void setWork_number_auto_14(String work_number_auto_14) {
		this.work_number_auto_14 = work_number_auto_14;
	}
	public String getComment_work_number_14() {
		return comment_work_number_14;
	}
	public void setComment_work_number_14(String comment_work_number_14) {
		this.comment_work_number_14 = comment_work_number_14;
	}
	public String getAdd_work_number_15() {
		return add_work_number_15;
	}
	public void setAdd_work_number_15(String add_work_number_15) {
		this.add_work_number_15 = add_work_number_15;
	}
	public String getWork_number_15() {
		return work_number_15;
	}
	public void setWork_number_15(String work_number_15) {
		this.work_number_15 = work_number_15;
	}
	public String getWork_number_auto_15() {
		return work_number_auto_15;
	}
	public void setWork_number_auto_15(String work_number_auto_15) {
		this.work_number_auto_15 = work_number_auto_15;
	}
	public String getComment_work_number_15() {
		return comment_work_number_15;
	}
	public void setComment_work_number_15(String comment_work_number_15) {
		this.comment_work_number_15 = comment_work_number_15;
	}
	public String getCompany_bra() {
		return company_bra;
	}
	public void setCompany_bra(String company_bra) {
		this.company_bra = company_bra;
	}
	public String getCompany_mex() {
		return company_mex;
	}
	public void setCompany_mex(String company_mex) {
		this.company_mex = company_mex;
	}
	public String getCompany_per() {
		return company_per;
	}
	public void setCompany_per(String company_per) {
		this.company_per = company_per;
	}
	public String getCompany_ecu() {
		return company_ecu;
	}
	public void setCompany_ecu(String company_ecu) {
		this.company_ecu = company_ecu;
	}
	public String getCompany_arg() {
		return company_arg;
	}
	public void setCompany_arg(String company_arg) {
		this.company_arg = company_arg;
	}
	public String getCompany_chi() {
		return company_chi;
	}
	public void setCompany_chi(String company_chi) {
		this.company_chi = company_chi;
	}
	public String getCompany_col() {
		return company_col;
	}
	public void setCompany_col(String company_col) {
		this.company_col = company_col;
	}
	public String getCompany_ven() {
		return company_ven;
	}
	public void setCompany_ven(String company_ven) {
		this.company_ven = company_ven;
	}
	public String getCompany_uru() {
		return company_uru;
	}
	public void setCompany_uru(String company_uru) {
		this.company_uru = company_uru;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getAddress_information() {
		return address_information;
	}
	public void setAddress_information(String address_information) {
		this.address_information = address_information;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_region() {
		return state_region;
	}
	public void setState_region(String state_region) {
		this.state_region = state_region;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCompany_name_ecu() {
		return company_name_ecu;
	}
	public void setCompany_name_ecu(String company_name_ecu) {
		this.company_name_ecu = company_name_ecu;
	}
	public String getStree_ecu() {
		return stree_ecu;
	}
	public void setStree_ecu(String stree_ecu) {
		this.stree_ecu = stree_ecu;
	}
	public String getCity_ecu() {
		return city_ecu;
	}
	public void setCity_ecu(String city_ecu) {
		this.city_ecu = city_ecu;
	}
	public String getState_region_ecu() {
		return state_region_ecu;
	}
	public void setState_region_ecu(String state_region_ecu) {
		this.state_region_ecu = state_region_ecu;
	}
	public String getPostal_code_ecu() {
		return postal_code_ecu;
	}
	public void setPostal_code_ecu(String postal_code_ecu) {
		this.postal_code_ecu = postal_code_ecu;
	}
	public String getCompany_name_arg() {
		return company_name_arg;
	}
	public void setCompany_name_arg(String company_name_arg) {
		this.company_name_arg = company_name_arg;
	}
	public String getStree_arg() {
		return stree_arg;
	}
	public void setStree_arg(String stree_arg) {
		this.stree_arg = stree_arg;
	}
	public String getCity_arg() {
		return city_arg;
	}
	public void setCity_arg(String city_arg) {
		this.city_arg = city_arg;
	}
	public String getState_region_arg() {
		return state_region_arg;
	}
	public void setState_region_arg(String state_region_arg) {
		this.state_region_arg = state_region_arg;
	}
	public String getPostal_code_arg() {
		return postal_code_arg;
	}
	public void setPostal_code_arg(String postal_code_arg) {
		this.postal_code_arg = postal_code_arg;
	}
	public String getCompany_name_uru() {
		return company_name_uru;
	}
	public void setCompany_name_uru(String company_name_uru) {
		this.company_name_uru = company_name_uru;
	}
	public String getStree_uru() {
		return stree_uru;
	}
	public void setStree_uru(String stree_uru) {
		this.stree_uru = stree_uru;
	}
	public String getCity_uru() {
		return city_uru;
	}
	public void setCity_uru(String city_uru) {
		this.city_uru = city_uru;
	}
	public String getState_region_uru() {
		return state_region_uru;
	}
	public void setState_region_uru(String state_region_uru) {
		this.state_region_uru = state_region_uru;
	}
	public String getPostal_code_uru() {
		return postal_code_uru;
	}
	public void setPostal_code_uru(String postal_code_uru) {
		this.postal_code_uru = postal_code_uru;
	}
	public String getCompany_name_chi() {
		return company_name_chi;
	}
	public void setCompany_name_chi(String company_name_chi) {
		this.company_name_chi = company_name_chi;
	}
	public String getStree_chi() {
		return stree_chi;
	}
	public void setStree_chi(String stree_chi) {
		this.stree_chi = stree_chi;
	}
	public String getCity_chi() {
		return city_chi;
	}
	public void setCity_chi(String city_chi) {
		this.city_chi = city_chi;
	}
	public String getState_region_chi() {
		return state_region_chi;
	}
	public void setState_region_chi(String state_region_chi) {
		this.state_region_chi = state_region_chi;
	}
	public String getPostal_code_chi() {
		return postal_code_chi;
	}
	public void setPostal_code_chi(String postal_code_chi) {
		this.postal_code_chi = postal_code_chi;
	}
	public String getCompany_name_chi1() {
		return company_name_chi1;
	}
	public void setCompany_name_chi1(String company_name_chi1) {
		this.company_name_chi1 = company_name_chi1;
	}
	public String getStree_chi1() {
		return stree_chi1;
	}
	public void setStree_chi1(String stree_chi1) {
		this.stree_chi1 = stree_chi1;
	}
	public String getCity_chi1() {
		return city_chi1;
	}
	public void setCity_chi1(String city_chi1) {
		this.city_chi1 = city_chi1;
	}
	public String getState_region_chi1() {
		return state_region_chi1;
	}
	public void setState_region_chi1(String state_region_chi1) {
		this.state_region_chi1 = state_region_chi1;
	}
	public String getPostal_code_chi1() {
		return postal_code_chi1;
	}
	public void setPostal_code_chi1(String postal_code_chi1) {
		this.postal_code_chi1 = postal_code_chi1;
	}
	public String getCompany_name_col() {
		return company_name_col;
	}
	public void setCompany_name_col(String company_name_col) {
		this.company_name_col = company_name_col;
	}
	public String getStree_col() {
		return stree_col;
	}
	public void setStree_col(String stree_col) {
		this.stree_col = stree_col;
	}
	public String getCity_col() {
		return city_col;
	}
	public void setCity_col(String city_col) {
		this.city_col = city_col;
	}
	public String getState_region_col() {
		return state_region_col;
	}
	public void setState_region_col(String state_region_col) {
		this.state_region_col = state_region_col;
	}
	public String getPostal_code_col() {
		return postal_code_col;
	}
	public void setPostal_code_col(String postal_code_col) {
		this.postal_code_col = postal_code_col;
	}
	public String getCompany_name_ven() {
		return company_name_ven;
	}
	public void setCompany_name_ven(String company_name_ven) {
		this.company_name_ven = company_name_ven;
	}
	public String getStree_ven() {
		return stree_ven;
	}
	public void setStree_ven(String stree_ven) {
		this.stree_ven = stree_ven;
	}
	public String getCity_ven() {
		return city_ven;
	}
	public void setCity_ven(String city_ven) {
		this.city_ven = city_ven;
	}
	public String getState_region_ven() {
		return state_region_ven;
	}
	public void setState_region_ven(String state_region_ven) {
		this.state_region_ven = state_region_ven;
	}
	public String getPostal_code_ve() {
		return postal_code_ve;
	}
	public void setPostal_code_ve(String postal_code_ve) {
		this.postal_code_ve = postal_code_ve;
	}
	public String getCompany_name_bra1() {
		return company_name_bra1;
	}
	public void setCompany_name_bra1(String company_name_bra1) {
		this.company_name_bra1 = company_name_bra1;
	}
	public String getStree_bra1() {
		return stree_bra1;
	}
	public void setStree_bra1(String stree_bra1) {
		this.stree_bra1 = stree_bra1;
	}
	public String getCity_bra1() {
		return city_bra1;
	}
	public void setCity_bra1(String city_bra1) {
		this.city_bra1 = city_bra1;
	}
	public String getState_region_bra1() {
		return state_region_bra1;
	}
	public void setState_region_bra1(String state_region_bra1) {
		this.state_region_bra1 = state_region_bra1;
	}
	public String getPostal_code_bra1() {
		return postal_code_bra1;
	}
	public void setPostal_code_bra1(String postal_code_bra1) {
		this.postal_code_bra1 = postal_code_bra1;
	}
	public String getCompany_name_bra2() {
		return company_name_bra2;
	}
	public void setCompany_name_bra2(String company_name_bra2) {
		this.company_name_bra2 = company_name_bra2;
	}
	public String getStree_bra2() {
		return stree_bra2;
	}
	public void setStree_bra2(String stree_bra2) {
		this.stree_bra2 = stree_bra2;
	}
	public String getCity_bra2() {
		return city_bra2;
	}
	public void setCity_bra2(String city_bra2) {
		this.city_bra2 = city_bra2;
	}
	public String getState_region_bra2() {
		return state_region_bra2;
	}
	public void setState_region_bra2(String state_region_bra2) {
		this.state_region_bra2 = state_region_bra2;
	}
	public String getPostal_code_bra2() {
		return postal_code_bra2;
	}
	public void setPostal_code_bra2(String postal_code_bra2) {
		this.postal_code_bra2 = postal_code_bra2;
	}
	public String getCompany_name_bra3() {
		return company_name_bra3;
	}
	public void setCompany_name_bra3(String company_name_bra3) {
		this.company_name_bra3 = company_name_bra3;
	}
	public String getStree_bra3() {
		return stree_bra3;
	}
	public void setStree_bra3(String stree_bra3) {
		this.stree_bra3 = stree_bra3;
	}
	public String getCity_bra3() {
		return city_bra3;
	}
	public void setCity_bra3(String city_bra3) {
		this.city_bra3 = city_bra3;
	}
	public String getState_region_bra3() {
		return state_region_bra3;
	}
	public void setState_region_bra3(String state_region_bra3) {
		this.state_region_bra3 = state_region_bra3;
	}
	public String getPostal_code_bra3() {
		return postal_code_bra3;
	}
	public void setPostal_code_bra3(String postal_code_bra3) {
		this.postal_code_bra3 = postal_code_bra3;
	}
	public String getCompany_name_per1() {
		return company_name_per1;
	}
	public void setCompany_name_per1(String company_name_per1) {
		this.company_name_per1 = company_name_per1;
	}
	public String getStree_per1() {
		return stree_per1;
	}
	public void setStree_per1(String stree_per1) {
		this.stree_per1 = stree_per1;
	}
	public String getCity_per1() {
		return city_per1;
	}
	public void setCity_per1(String city_per1) {
		this.city_per1 = city_per1;
	}
	public String getState_region_per1() {
		return state_region_per1;
	}
	public void setState_region_per1(String state_region_per1) {
		this.state_region_per1 = state_region_per1;
	}
	public String getPostal_code_per1() {
		return postal_code_per1;
	}
	public void setPostal_code_per1(String postal_code_per1) {
		this.postal_code_per1 = postal_code_per1;
	}
	public String getCompany_name_per2() {
		return company_name_per2;
	}
	public void setCompany_name_per2(String company_name_per2) {
		this.company_name_per2 = company_name_per2;
	}
	public String getStree_per2() {
		return stree_per2;
	}
	public void setStree_per2(String stree_per2) {
		this.stree_per2 = stree_per2;
	}
	public String getCity_per2() {
		return city_per2;
	}
	public void setCity_per2(String city_per2) {
		this.city_per2 = city_per2;
	}
	public String getState_region_per2() {
		return state_region_per2;
	}
	public void setState_region_per2(String state_region_per2) {
		this.state_region_per2 = state_region_per2;
	}
	public String getPostal_code_per2() {
		return postal_code_per2;
	}
	public void setPostal_code_per2(String postal_code_per2) {
		this.postal_code_per2 = postal_code_per2;
	}
	public String getCompany_name_mex1() {
		return company_name_mex1;
	}
	public void setCompany_name_mex1(String company_name_mex1) {
		this.company_name_mex1 = company_name_mex1;
	}
	public String getStree_mex1() {
		return stree_mex1;
	}
	public void setStree_mex1(String stree_mex1) {
		this.stree_mex1 = stree_mex1;
	}
	public String getCity_mex1() {
		return city_mex1;
	}
	public void setCity_mex1(String city_mex1) {
		this.city_mex1 = city_mex1;
	}
	public String getState_region_mex1() {
		return state_region_mex1;
	}
	public void setState_region_mex1(String state_region_mex1) {
		this.state_region_mex1 = state_region_mex1;
	}
	public String getPostal_code_mex1() {
		return postal_code_mex1;
	}
	public void setPostal_code_mex1(String postal_code_mex1) {
		this.postal_code_mex1 = postal_code_mex1;
	}
	public String getCompany_name_mex2() {
		return company_name_mex2;
	}
	public void setCompany_name_mex2(String company_name_mex2) {
		this.company_name_mex2 = company_name_mex2;
	}
	public String getStree_mex2() {
		return stree_mex2;
	}
	public void setStree_mex2(String stree_mex2) {
		this.stree_mex2 = stree_mex2;
	}
	public String getCity_mex2() {
		return city_mex2;
	}
	public void setCity_mex2(String city_mex2) {
		this.city_mex2 = city_mex2;
	}
	public String getState_region_mex2() {
		return state_region_mex2;
	}
	public void setState_region_mex2(String state_region_mex2) {
		this.state_region_mex2 = state_region_mex2;
	}
	public String getPostal_code_mex2() {
		return postal_code_mex2;
	}
	public void setPostal_code_mex2(String postal_code_mex2) {
		this.postal_code_mex2 = postal_code_mex2;
	}
	public String getCompany_name_mex3() {
		return company_name_mex3;
	}
	public void setCompany_name_mex3(String company_name_mex3) {
		this.company_name_mex3 = company_name_mex3;
	}
	public String getStree_mex3() {
		return stree_mex3;
	}
	public void setStree_mex3(String stree_mex3) {
		this.stree_mex3 = stree_mex3;
	}
	public String getCity_mex3() {
		return city_mex3;
	}
	public void setCity_mex3(String city_mex3) {
		this.city_mex3 = city_mex3;
	}
	public String getState_region_mex3() {
		return state_region_mex3;
	}
	public void setState_region_mex3(String state_region_mex3) {
		this.state_region_mex3 = state_region_mex3;
	}
	public String getPostal_code_mex3() {
		return postal_code_mex3;
	}
	public void setPostal_code_mex3(String postal_code_mex3) {
		this.postal_code_mex3 = postal_code_mex3;
	}
	public String getCompany_name_mex4() {
		return company_name_mex4;
	}
	public void setCompany_name_mex4(String company_name_mex4) {
		this.company_name_mex4 = company_name_mex4;
	}
	public String getStree_mex4() {
		return stree_mex4;
	}
	public void setStree_mex4(String stree_mex4) {
		this.stree_mex4 = stree_mex4;
	}
	public String getCity_mex4() {
		return city_mex4;
	}
	public void setCity_mex4(String city_mex4) {
		this.city_mex4 = city_mex4;
	}
	public String getState_region_mex4() {
		return state_region_mex4;
	}
	public void setState_region_mex4(String state_region_mex4) {
		this.state_region_mex4 = state_region_mex4;
	}
	public String getPostal_code_mex4() {
		return postal_code_mex4;
	}
	public void setPostal_code_mex4(String postal_code_mex4) {
		this.postal_code_mex4 = postal_code_mex4;
	}
	public String getCompany_name_mex5() {
		return company_name_mex5;
	}
	public void setCompany_name_mex5(String company_name_mex5) {
		this.company_name_mex5 = company_name_mex5;
	}
	public String getStree_mex5() {
		return stree_mex5;
	}
	public void setStree_mex5(String stree_mex5) {
		this.stree_mex5 = stree_mex5;
	}
	public String getCity_mex5() {
		return city_mex5;
	}
	public void setCity_mex5(String city_mex5) {
		this.city_mex5 = city_mex5;
	}
	public String getState_region_mex5() {
		return state_region_mex5;
	}
	public void setState_region_mex5(String state_region_mex5) {
		this.state_region_mex5 = state_region_mex5;
	}
	public String getPostal_code_mex5() {
		return postal_code_mex5;
	}
	public void setPostal_code_mex5(String postal_code_mex5) {
		this.postal_code_mex5 = postal_code_mex5;
	}
	public String getCompany_name_mex6() {
		return company_name_mex6;
	}
	public void setCompany_name_mex6(String company_name_mex6) {
		this.company_name_mex6 = company_name_mex6;
	}
	public String getStree_mex6() {
		return stree_mex6;
	}
	public void setStree_mex6(String stree_mex6) {
		this.stree_mex6 = stree_mex6;
	}
	public String getCity_mex6() {
		return city_mex6;
	}
	public void setCity_mex6(String city_mex6) {
		this.city_mex6 = city_mex6;
	}
	public String getState_region_mex6() {
		return state_region_mex6;
	}
	public void setState_region_mex6(String state_region_mex6) {
		this.state_region_mex6 = state_region_mex6;
	}
	public String getPostal_code_mex6() {
		return postal_code_mex6;
	}
	public void setPostal_code_mex6(String postal_code_mex6) {
		this.postal_code_mex6 = postal_code_mex6;
	}
	public String getResponsible_purchase() {
		return responsible_purchase;
	}
	public void setResponsible_purchase(String responsible_purchase) {
		this.responsible_purchase = responsible_purchase;
	}
	public String getBusines_case() {
		return busines_case;
	}
	public void setBusines_case(String busines_case) {
		this.busines_case = busines_case;
	}
	public String getApprover1() {
		return approver1;
	}
	public void setApprover1(String approver1) {
		this.approver1 = approver1;
	}
	public String getApprover2() {
		return approver2;
	}
	public void setApprover2(String approver2) {
		this.approver2 = approver2;
	}
	public String getApprover3() {
		return approver3;
	}
	public void setApprover3(String approver3) {
		this.approver3 = approver3;
	}
	public String getApprover4() {
		return approver4;
	}
	public void setApprover4(String approver4) {
		this.approver4 = approver4;
	}
	public String getApprover5() {
		return approver5;
	}
	public void setApprover5(String approver5) {
		this.approver5 = approver5;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getBusiness_justification() {
		return business_justification;
	}
	public void setBusiness_justification(String business_justification) {
		this.business_justification = business_justification;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getContract_number() {
		return contract_number;
	}
	public void setContract_number(String contract_number) {
		this.contract_number = contract_number;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public String getMajor_account() {
		return major_account;
	}
	public void setMajor_account(String major_account) {
		this.major_account = major_account;
	}
	public String getCost_center() {
		return cost_center;
	}
	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	public String getPart_number_a() {
		return part_number_a;
	}
	public void setPart_number_a(String part_number_a) {
		this.part_number_a = part_number_a;
	}
	public String getQuantity_a() {
		return quantity_a;
	}
	public void setQuantity_a(String quantity_a) {
		this.quantity_a = quantity_a;
	}
	public String getAdd_PN_QTY_b() {
		return add_PN_QTY_b;
	}
	public void setAdd_PN_QTY_b(String add_PN_QTY_b) {
		this.add_PN_QTY_b = add_PN_QTY_b;
	}
	public String getPart_number_b() {
		return part_number_b;
	}
	public void setPart_number_b(String part_number_b) {
		this.part_number_b = part_number_b;
	}
	public String getQuantity_b() {
		return quantity_b;
	}
	public void setQuantity_b(String quantity_b) {
		this.quantity_b = quantity_b;
	}
	public String getAdd_PN_QTY_c() {
		return add_PN_QTY_c;
	}
	public void setAdd_PN_QTY_c(String add_PN_QTY_c) {
		this.add_PN_QTY_c = add_PN_QTY_c;
	}
	public String getPart_number_c() {
		return part_number_c;
	}
	public void setPart_number_c(String part_number_c) {
		this.part_number_c = part_number_c;
	}
	public String getQuantity_c() {
		return quantity_c;
	}
	public void setQuantity_c(String quantity_c) {
		this.quantity_c = quantity_c;
	}
	public String getAdd_PN_QTY_d() {
		return add_PN_QTY_d;
	}
	public void setAdd_PN_QTY_d(String add_PN_QTY_d) {
		this.add_PN_QTY_d = add_PN_QTY_d;
	}
	public String getPart_number_d() {
		return part_number_d;
	}
	public void setPart_number_d(String part_number_d) {
		this.part_number_d = part_number_d;
	}
	public String getQuantity_d() {
		return quantity_d;
	}
	public void setQuantity_d(String quantity_d) {
		this.quantity_d = quantity_d;
	}
	public String getAdd_PN_QTY_e() {
		return add_PN_QTY_e;
	}
	public void setAdd_PN_QTY_e(String add_PN_QTY_e) {
		this.add_PN_QTY_e = add_PN_QTY_e;
	}
	public String getPart_number_e() {
		return part_number_e;
	}
	public void setPart_number_e(String part_number_e) {
		this.part_number_e = part_number_e;
	}
	public String getQuantity_e() {
		return quantity_e;
	}
	public void setQuantity_e(String quantity_e) {
		this.quantity_e = quantity_e;
	}
	public String getOther_PN_QTY() {
		return other_PN_QTY;
	}
	public void setOther_PN_QTY(String other_PN_QTY) {
		this.other_PN_QTY = other_PN_QTY;
	}
	public String getAttach_quotation() {
		return attach_quotation;
	}
	public void setAttach_quotation(String attach_quotation) {
		this.attach_quotation = attach_quotation;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getCalculation() {
		return calculation;
	}
	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}
	public String getCurrency_B() {
		return currency_B;
	}
	public void setCurrency_B(String currency_B) {
		this.currency_B = currency_B;
	}
	public String getCurrency_M() {
		return currency_M;
	}
	public void setCurrency_M(String currency_M) {
		this.currency_M = currency_M;
	}
	public String getCurrency_A() {
		return currency_A;
	}
	public void setCurrency_A(String currency_A) {
		this.currency_A = currency_A;
	}
	public String getCurrency_C() {
		return currency_C;
	}
	public void setCurrency_C(String currency_C) {
		this.currency_C = currency_C;
	}
	public String getCurrency_O() {
		return currency_O;
	}
	public void setCurrency_O(String currency_O) {
		this.currency_O = currency_O;
	}
	public String getCurrency_E() {
		return currency_E;
	}
	public void setCurrency_E(String currency_E) {
		this.currency_E = currency_E;
	}
	public String getCurrency_P() {
		return currency_P;
	}
	public void setCurrency_P(String currency_P) {
		this.currency_P = currency_P;
	}
	public String getCurrency_U() {
		return currency_U;
	}
	public void setCurrency_U(String currency_U) {
		this.currency_U = currency_U;
	}
	public String getCurrency_V() {
		return currency_V;
	}
	public void setCurrency_V(String currency_V) {
		this.currency_V = currency_V;
	}
	public String getLast_approver_1_manual() {
		return last_approver_1_manual;
	}
	public void setLast_approver_1_manual(String last_approver_1_manual) {
		this.last_approver_1_manual = last_approver_1_manual;
	}
	public String getLast_approver_1_AUTO() {
		return last_approver_1_AUTO;
	}
	public void setLast_approver_1_AUTO(String last_approver_1_AUTO) {
		this.last_approver_1_AUTO = last_approver_1_AUTO;
	}
	public String getLast_approver_1_AUTO_1() {
		return last_approver_1_AUTO_1;
	}
	public void setLast_approver_1_AUTO_1(String last_approver_1_AUTO_1) {
		this.last_approver_1_AUTO_1 = last_approver_1_AUTO_1;
	}
	public String getChange_approer() {
		return change_approer;
	}
	public void setChange_approer(String change_approer) {
		this.change_approer = change_approer;
	}
	public String getOther_approver_SSA() {
		return other_approver_SSA;
	}
	public void setOther_approver_SSA(String other_approver_SSA) {
		this.other_approver_SSA = other_approver_SSA;
	}
	public String getOther_approver_BRAMEX() {
		return other_approver_BRAMEX;
	}
	public void setOther_approver_BRAMEX(String other_approver_BRAMEX) {
		this.other_approver_BRAMEX = other_approver_BRAMEX;
	}
	public String getAdd_approver_2() {
		return add_approver_2;
	}
	public void setAdd_approver_2(String add_approver_2) {
		this.add_approver_2 = add_approver_2;
	}
	public String getOther_approver_2() {
		return other_approver_2;
	}
	public void setOther_approver_2(String other_approver_2) {
		this.other_approver_2 = other_approver_2;
	}
	public String getAdd_approver_3() {
		return add_approver_3;
	}
	public void setAdd_approver_3(String add_approver_3) {
		this.add_approver_3 = add_approver_3;
	}
	public String getOther_approver_3() {
		return other_approver_3;
	}
	public void setOther_approver_3(String other_approver_3) {
		this.other_approver_3 = other_approver_3;
	}
	public String getType() {
		return "REQUEST";
	}
	public void setType(String type) {
		this.type = "REQUEST";
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getLoa() {
		return loa;
	}
	public void setLoa(String loa) {
		this.loa = loa;
	}
	public String getInternalProject() {
		return internalProject;
	}
	public void setInternalProject(String internalProject) {
		this.internalProject = internalProject;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getLoaSipYn() {
		return loaSipYn;
	}
	public void setLoaSipYn(String loaSipYn) {
		this.loaSipYn = loaSipYn;
	}
	public String getLoaCnYn() {
		return loaCnYn;
	}
	public void setLoaCnYn(String loaCnYn) {
		this.loaCnYn = loaCnYn;
	}
	public String getLoaCustomer() {
		return loaCustomer;
	}
	public void setLoaCustomer(String loaCustomer) {
		this.loaCustomer = loaCustomer;
	}
	public String getSip() {
		return sip;
	}
	public void setSip(String sip) {
		this.sip = sip;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDpe() {
		return dpe;
	}
	public void setDpe(String dpe) {
		this.dpe = dpe;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getPurchasingCompany() {
		return purchasingCompany;
	}
	public void setPurchasingCompany(String purchasingCompany) {
		this.purchasingCompany = purchasingCompany;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getServiceTermOrSWTerm() {
		return serviceTermOrSWTerm;
	}
	public void setServiceTermOrSWTerm(String serviceTermOrSWTerm) {
		this.serviceTermOrSWTerm = serviceTermOrSWTerm;
	}
	public String getServiceTermOrSWTermComments() {
		return serviceTermOrSWTermComments;
	}
	public void setServiceTermOrSWTermComments(String serviceTermOrSWTermComments) {
		this.serviceTermOrSWTermComments = serviceTermOrSWTermComments;
	}
	public String getServiceTermOrSWTermStartDate() {
		return serviceTermOrSWTermStartDate;
	}
	public void setServiceTermOrSWTermStartDate(String serviceTermOrSWTermStartDate) {
		this.serviceTermOrSWTermStartDate = serviceTermOrSWTermStartDate;
	}
	public String getServiceTermOrSWTermEndDate() {
		return serviceTermOrSWTermEndDate;
	}
	public void setServiceTermOrSWTermEndDate(String serviceTermOrSWTermEndDate) {
		this.serviceTermOrSWTermEndDate = serviceTermOrSWTermEndDate;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public String getCapexYN() {
		return capexYN;
	}
	public void setCapexYN(String capexYN) {
		this.capexYN = capexYN;
	}
	public String getCapexNumber() {
		return capexNumber;
	}
	public void setCapexNumber(String capexNumber) {
		this.capexNumber = capexNumber;
	}
	public String getComplementaryBondYN() {
		return complementaryBondYN;
	}
	public void setComplementaryBondYN(String complementaryBondYN) {
		this.complementaryBondYN = complementaryBondYN;
	}
	public String getComplementaryBond() {
		return complementaryBond;
	}
	public void setComplementaryBond(String complementaryBond) {
		this.complementaryBond = complementaryBond;
	}
	public String getComplementaryPmoBond() {
		return complementaryPmoBond;
	}
	public void setComplementaryPmoBond(String complementaryPmoBond) {
		this.complementaryPmoBond = complementaryPmoBond;
	}
	public String getComplianceEngineering() {
		return complianceEngineering;
	}
	public void setComplianceEngineering(String complianceEngineering) {
		this.complianceEngineering = complianceEngineering;
	}
	public String getReviewers() {
		return reviewers;
	}
	public void setReviewers(String reviewers) {
		this.reviewers = reviewers;
	}
	public String getPurchaseDescription() {
		return purchaseDescription;
	}
	public void setPurchaseDescription(String purchaseDescription) {
		this.purchaseDescription = purchaseDescription;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getWorkNumberYN() {
		return workNumberYN;
	}
	public void setWorkNumberYN(String workNumberYN) {
		this.workNumberYN = workNumberYN;
	}
	public String getWorkNumbers() {
		return workNumbers;
	}
	public void setWorkNumbers(String workNumbers) {
		this.workNumbers = workNumbers;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryCompanyName() {
		return deliveryCompanyName;
	}
	public void setDeliveryCompanyName(String deliveryCompanyName) {
		this.deliveryCompanyName = deliveryCompanyName;
	}
	public String getDeliveryStreet() {
		return deliveryStreet;
	}
	public void setDeliveryStreet(String deliveryStreet) {
		this.deliveryStreet = deliveryStreet;
	}
	public String getDeliveryCity() {
		return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}
	public String getDeliveryStateRegion() {
		return deliveryStateRegion;
	}
	public void setDeliveryStateRegion(String deliveryStateRegion) {
		this.deliveryStateRegion = deliveryStateRegion;
	}
	public String getDeliveryPostalCode() {
		return deliveryPostalCode;
	}
	public void setDeliveryPostalCode(String deliveryPostalCode) {
		this.deliveryPostalCode = deliveryPostalCode;
	}
	public String getResponsiblePurchase() {
		return responsiblePurchase;
	}
	public void setResponsiblePurchase(String responsiblePurchase) {
		this.responsiblePurchase = responsiblePurchase;
	}
	public String getBusinessCase() {
		return businessCase;
	}
	public void setBusinessCase(String businessCase) {
		this.businessCase = businessCase;
	}
	public String getBondApprovers() {
		return bondApprovers;
	}
	public void setBondApprovers(String bondApprovers) {
		this.bondApprovers = bondApprovers;
	}
	public String getGeneralCommments() {
		return generalCommments;
	}
	public void setGeneralCommments(String generalCommments) {
		this.generalCommments = generalCommments;
	}
	public String getBusinessJustification() {
		return businessJustification;
	}
	public void setBusinessJustification(String businessJustification) {
		this.businessJustification = businessJustification;
	}
	public String getPartNumberOrQuotation() {
		return partNumberOrQuotation;
	}
	public void setPartNumberOrQuotation(String partNumberOrQuotation) {
		this.partNumberOrQuotation = partNumberOrQuotation;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
    	
}
