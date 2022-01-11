package com.gxitsky.structural.proxy.static_proxy3;

/**
 * 代理对象
 *
 * @author Rocky
 */
public class MapperProxy extends BaseMapper {

    private BatchMapper batchMapper;

    public MapperProxy(BatchMapper batchMapper) {
        this.batchMapper = batchMapper;
    }

    public void save() {
        System.out.println("代理增强：  开始保存。。。。");
        batchMapper.save();
        System.out.println("代理增强：  保存结束。。。。");
    }

    public void batchSave() {
        System.out.println("代理增强：  批量保存。。。。");
        batchMapper.batchSave();
        System.out.println("代理增强：  保存结束。。。。");
    }
}
