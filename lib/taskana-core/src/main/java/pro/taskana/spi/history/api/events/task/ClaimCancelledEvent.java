package pro.taskana.spi.history.api.events.task;

import pro.taskana.task.api.models.Task;

/** Event fired if a task is cancelled to be claimed. */
public class ClaimCancelledEvent extends TaskEvent {

  public ClaimCancelledEvent(Task task, String userId) {
    super(task, userId, null);
    eventType = "TASK_CLAIM_CANCELLED";
    created = task.getModified();
  }
}
