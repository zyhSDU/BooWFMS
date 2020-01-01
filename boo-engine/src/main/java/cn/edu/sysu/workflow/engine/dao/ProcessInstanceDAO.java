package cn.edu.sysu.workflow.engine.dao;

import cn.edu.sysu.workflow.common.entity.ProcessInstance;

/**
 * 流程实例数据库处理
 *
 * @author Skye
 * Created on 2019/12/29
 */
public interface ProcessInstanceDAO {

    /**
     * 创建服务信息
     *
     * @param processInstance <ul>
     *                        <li>processInstanceId</li>
     *                        <li>processId</li>
     *                        <li>launchAccountId</li>
     *                        <li>launchMethod</li>
     *                        <li>launchType</li>
     *                        <li>engineId</li>
     *                        <li>resourceServiceId</li>
     *                        <li>resourceBinding</li>
     *                        <li>resourceBindingType</li>
     *                        <li>failureType</li>
     *                        <li>resultType</li>
     *                        <li>tag</li>
     *                        </ul>
     * @return 新增的数据量
     */
    int save(ProcessInstance processInstance);

    /**
     * 更新流程实例，不允许更新流程实例Id
     *
     * @param processInstance <ul>
     *                        <li>processInstanceId</li>
     *                        <li>processId</li>
     *                        <li>launchAccountId</li>
     *                        <li>launchMethod</li>
     *                        <li>launchType</li>
     *                        <li>engineId</li>
     *                        <li>resourceServiceId</li>
     *                        <li>resourceBinding</li>
     *                        <li>resourceBindingType</li>
     *                        <li>failureType</li>
     *                        <li>launchTimestamp</li>
     *                        <li>finishTimestamp</li>
     *                        <li>tag</li>
     *                        </ul>
     * @return 修改的数据量
     */
    int update(ProcessInstance processInstance);

    /**
     * 根据流程实例Id查找流程实例数据
     *
     * @param processInstanceId
     * @return
     */
    ProcessInstance findOne(String processInstanceId);

}