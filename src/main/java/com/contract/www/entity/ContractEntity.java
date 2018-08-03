package com.contract.www.entity;

import com.contract.www.baseconfig.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Danny on 2018/8/3.
 */
@Entity
@Table(name = "t_contract")
public class ContractEntity extends BaseEntity {
    private String content;
    private String companyName;
    private Integer contactId;
    private String phone;
    private String fax;
    private Integer salemanId;
    private String amount;

    public ContractEntity() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getSalemanId() {
        return salemanId;
    }

    public void setSalemanId(Integer salemanId) {
        this.salemanId = salemanId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
