package org.sakaiproject.api.app.messageforums.events;

import org.sakaiproject.api.app.messageforums.DiscussionForumService;
import org.sakaiproject.event.api.LearningResourceStoreService.LRS_Statement;

/**
 * The parameters (type and LRS statement) for a Forums message event to be posted to the Event Tracking Service
 * @author plukasew
 */
public class ForumsMessageEventParams
{
	public final MessageEvent event;
	public final LRS_Statement lrsStatement;

	/**
	 * Constructs an immutable ForumsMessageEventParams object
	 * @param event the type of event
	 * @param lrsStatement the LRS statement to include with the event, or null if no statement
	 */
	public ForumsMessageEventParams(MessageEvent event, LRS_Statement lrsStatement)
	{
		this.event = event;
		this.lrsStatement = lrsStatement;
	}

	/**
	 * The possible message event types fired by the Forums tool
	 */
	public enum MessageEvent
	{
		ADD(DiscussionForumService.EVENT_FORUMS_ADD, true),
		READ(DiscussionForumService.EVENT_FORUMS_READ, false),
		REMOVE(DiscussionForumService.EVENT_FORUMS_REMOVE, true),
		RESPONSE(DiscussionForumService.EVENT_FORUMS_RESPONSE, false),
		REVISE(DiscussionForumService.EVENT_FORUMS_REVISE, true);

		public final String type;
		public final boolean modification;

		MessageEvent(String type, boolean modification)
		{
			this.type = type;
			this.modification = modification;
		}
	}
}
