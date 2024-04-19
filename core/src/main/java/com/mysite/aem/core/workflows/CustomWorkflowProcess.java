package com.mysite.aem.core.workflows;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;
import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Component;

@Component(
        service = WorkflowProcess.class,
        immediate = true
)
public class CustomWorkflowProcess implements WorkflowProcess {
    private static Logger logger = Logger.getLogger(CustomWorkflowProcess.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        logger.info("Executed the custom workflow process.");
    }
}
