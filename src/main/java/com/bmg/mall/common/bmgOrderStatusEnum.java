package com.bmg.mall.common;

public enum bmgOrderStatusEnum {
    DEFAULT(-9, "ERROR"),
    ORDER_PRE_PAY(0, "待支付"),
    OREDER_PAID(1, "已支付"),
    OREDER_PACKAGED(2, "配货完成"),
    OREDER_EXPRESS(3, "出库成功"),
    ORDER_SUCCESS(4, "交易成功"),
    ORDER_CLOSED_BY_MALLUSER(-1, "手动关闭"),
    ORDER_CLOSED_BY_EXPIRED(-2, "超时关闭"),
    ORDER_CLOSED_BY_JUDGE(-3, "商家关闭");

    private int orderStatus;

    private String name;

    bmgOrderStatusEnum(int orderStatus, String name) {
        this.orderStatus = orderStatus;
        this.name = name;
    }

    public static bmgOrderStatusEnum getbmgOrderStatusEnumByStatus(int orderStatus) {
        for (bmgOrderStatusEnum bmgOrderStatusEnum : bmgOrderStatusEnum.values()) {
            if (bmgOrderStatusEnum.getOrderStatus() == orderStatus) {
                return bmgOrderStatusEnum;
            }
        }
        return DEFAULT;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
