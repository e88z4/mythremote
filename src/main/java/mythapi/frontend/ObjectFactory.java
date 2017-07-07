
package mythapi.frontend;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mythapi.frontend package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfString_QNAME = new QName("http://mythtv.org", "ArrayOfString");
    private final static QName _FrontendStatus_QNAME = new QName("http://mythtv.org", "FrontendStatus");
    private final static QName _MapOfStringAction_QNAME = new QName("http://mythtv.org", "MapOfStringAction");
    private final static QName _FrontendActionList_QNAME = new QName("http://mythtv.org", "FrontendActionList");
    private final static QName _MapOfStringTrack_QNAME = new QName("http://mythtv.org", "MapOfStringTrack");
    private final static QName _MapOfStringString_QNAME = new QName("http://mythtv.org", "MapOfStringString");
    private final static QName _SendActionAction_QNAME = new QName("http://mythtv.org", "Action");
    private final static QName _SendActionWidth_QNAME = new QName("http://mythtv.org", "Width");
    private final static QName _SendActionValue_QNAME = new QName("http://mythtv.org", "Value");
    private final static QName _SendActionHeight_QNAME = new QName("http://mythtv.org", "Height");
    private final static QName _PlayVideoResponsePlayVideoResult_QNAME = new QName("http://mythtv.org", "PlayVideoResult");
    private final static QName _SendActionResponseSendActionResult_QNAME = new QName("http://mythtv.org", "SendActionResult");
    private final static QName _GetContextListResponseGetContextListResult_QNAME = new QName("http://mythtv.org", "GetContextListResult");
    private final static QName _SendNotificationMessage_QNAME = new QName("http://mythtv.org", "Message");
    private final static QName _SendNotificationTimeout_QNAME = new QName("http://mythtv.org", "Timeout");
    private final static QName _SendNotificationPriority_QNAME = new QName("http://mythtv.org", "Priority");
    private final static QName _SendNotificationOrigin_QNAME = new QName("http://mythtv.org", "Origin");
    private final static QName _SendNotificationProgress_QNAME = new QName("http://mythtv.org", "Progress");
    private final static QName _SendNotificationDescription_QNAME = new QName("http://mythtv.org", "Description");
    private final static QName _SendNotificationImage_QNAME = new QName("http://mythtv.org", "Image");
    private final static QName _SendNotificationError_QNAME = new QName("http://mythtv.org", "Error");
    private final static QName _SendNotificationProgressText_QNAME = new QName("http://mythtv.org", "ProgressText");
    private final static QName _SendNotificationExtra_QNAME = new QName("http://mythtv.org", "Extra");
    private final static QName _SendNotificationType_QNAME = new QName("http://mythtv.org", "Type");
    private final static QName _SendNotificationFullscreen_QNAME = new QName("http://mythtv.org", "Fullscreen");
    private final static QName _SendNotificationVisibility_QNAME = new QName("http://mythtv.org", "Visibility");
    private final static QName _PlayRecordingResponsePlayRecordingResult_QNAME = new QName("http://mythtv.org", "PlayRecordingResult");
    private final static QName _GetActionListContext_QNAME = new QName("http://mythtv.org", "Context");
    private final static QName _SendKeyKey_QNAME = new QName("http://mythtv.org", "Key");
    private final static QName _SendMessageResponseSendMessageResult_QNAME = new QName("http://mythtv.org", "SendMessageResult");
    private final static QName _GetActionListResponseGetActionListResult_QNAME = new QName("http://mythtv.org", "GetActionListResult");
    private final static QName _SendNotificationResponseSendNotificationResult_QNAME = new QName("http://mythtv.org", "SendNotificationResult");
    private final static QName _GetStatusResponseGetStatusResult_QNAME = new QName("http://mythtv.org", "GetStatusResult");
    private final static QName _SendKeyResponseSendKeyResult_QNAME = new QName("http://mythtv.org", "SendKeyResult");
    private final static QName _PlayRecordingChanId_QNAME = new QName("http://mythtv.org", "ChanId");
    private final static QName _PlayRecordingRecordedId_QNAME = new QName("http://mythtv.org", "RecordedId");
    private final static QName _PlayRecordingStartTime_QNAME = new QName("http://mythtv.org", "StartTime");
    private final static QName _PlayVideoUseBookmark_QNAME = new QName("http://mythtv.org", "UseBookmark");
    private final static QName _PlayVideoId_QNAME = new QName("http://mythtv.org", "Id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mythapi.frontend
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapOfStringTrack }
     * 
     */
    public MapOfStringTrack createMapOfStringTrack() {
        return new MapOfStringTrack();
    }

    /**
     * Create an instance of {@link MapOfStringString }
     * 
     */
    public MapOfStringString createMapOfStringString() {
        return new MapOfStringString();
    }

    /**
     * Create an instance of {@link MapOfStringAction }
     * 
     */
    public MapOfStringAction createMapOfStringAction() {
        return new MapOfStringAction();
    }

    /**
     * Create an instance of {@link GetContextList }
     * 
     */
    public GetContextList createGetContextList() {
        return new GetContextList();
    }

    /**
     * Create an instance of {@link SendKeyResponse }
     * 
     */
    public SendKeyResponse createSendKeyResponse() {
        return new SendKeyResponse();
    }

    /**
     * Create an instance of {@link PlayVideo }
     * 
     */
    public PlayVideo createPlayVideo() {
        return new PlayVideo();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link FrontendStatus }
     * 
     */
    public FrontendStatus createFrontendStatus() {
        return new FrontendStatus();
    }

    /**
     * Create an instance of {@link SendAction }
     * 
     */
    public SendAction createSendAction() {
        return new SendAction();
    }

    /**
     * Create an instance of {@link PlayVideoResponse }
     * 
     */
    public PlayVideoResponse createPlayVideoResponse() {
        return new PlayVideoResponse();
    }

    /**
     * Create an instance of {@link SendKey }
     * 
     */
    public SendKey createSendKey() {
        return new SendKey();
    }

    /**
     * Create an instance of {@link GetContextListResponse }
     * 
     */
    public GetContextListResponse createGetContextListResponse() {
        return new GetContextListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link SendNotification }
     * 
     */
    public SendNotification createSendNotification() {
        return new SendNotification();
    }

    /**
     * Create an instance of {@link PlayRecording }
     * 
     */
    public PlayRecording createPlayRecording() {
        return new PlayRecording();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link SendActionResponse }
     * 
     */
    public SendActionResponse createSendActionResponse() {
        return new SendActionResponse();
    }

    /**
     * Create an instance of {@link GetActionListResponse }
     * 
     */
    public GetActionListResponse createGetActionListResponse() {
        return new GetActionListResponse();
    }

    /**
     * Create an instance of {@link FrontendActionList }
     * 
     */
    public FrontendActionList createFrontendActionList() {
        return new FrontendActionList();
    }

    /**
     * Create an instance of {@link GetActionList }
     * 
     */
    public GetActionList createGetActionList() {
        return new GetActionList();
    }

    /**
     * Create an instance of {@link SendNotificationResponse }
     * 
     */
    public SendNotificationResponse createSendNotificationResponse() {
        return new SendNotificationResponse();
    }

    /**
     * Create an instance of {@link PlayRecordingResponse }
     * 
     */
    public PlayRecordingResponse createPlayRecordingResponse() {
        return new PlayRecordingResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link MapOfStringTrack.Track }
     * 
     */
    public MapOfStringTrack.Track createMapOfStringTrackTrack() {
        return new MapOfStringTrack.Track();
    }

    /**
     * Create an instance of {@link MapOfStringString.String }
     * 
     */
    public MapOfStringString.String createMapOfStringStringString() {
        return new MapOfStringString.String();
    }

    /**
     * Create an instance of {@link MapOfStringAction.Action }
     * 
     */
    public MapOfStringAction.Action createMapOfStringActionAction() {
        return new MapOfStringAction.Action();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrontendStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FrontendStatus")
    public JAXBElement<FrontendStatus> createFrontendStatus(FrontendStatus value) {
        return new JAXBElement<FrontendStatus>(_FrontendStatus_QNAME, FrontendStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapOfStringAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MapOfStringAction")
    public JAXBElement<MapOfStringAction> createMapOfStringAction(MapOfStringAction value) {
        return new JAXBElement<MapOfStringAction>(_MapOfStringAction_QNAME, MapOfStringAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrontendActionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "FrontendActionList")
    public JAXBElement<FrontendActionList> createFrontendActionList(FrontendActionList value) {
        return new JAXBElement<FrontendActionList>(_FrontendActionList_QNAME, FrontendActionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapOfStringTrack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MapOfStringTrack")
    public JAXBElement<MapOfStringTrack> createMapOfStringTrack(MapOfStringTrack value) {
        return new JAXBElement<MapOfStringTrack>(_MapOfStringTrack_QNAME, MapOfStringTrack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapOfStringString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "MapOfStringString")
    public JAXBElement<MapOfStringString> createMapOfStringString(MapOfStringString value) {
        return new JAXBElement<MapOfStringString>(_MapOfStringString_QNAME, MapOfStringString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Action", scope = SendAction.class)
    public JAXBElement<java.lang.String> createSendActionAction(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendActionAction_QNAME, java.lang.String.class, SendAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Width", scope = SendAction.class)
    public JAXBElement<Long> createSendActionWidth(Long value) {
        return new JAXBElement<Long>(_SendActionWidth_QNAME, Long.class, SendAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Value", scope = SendAction.class)
    public JAXBElement<java.lang.String> createSendActionValue(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendActionValue_QNAME, java.lang.String.class, SendAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Height", scope = SendAction.class)
    public JAXBElement<Long> createSendActionHeight(Long value) {
        return new JAXBElement<Long>(_SendActionHeight_QNAME, Long.class, SendAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PlayVideoResult", scope = PlayVideoResponse.class)
    public JAXBElement<Boolean> createPlayVideoResponsePlayVideoResult(Boolean value) {
        return new JAXBElement<Boolean>(_PlayVideoResponsePlayVideoResult_QNAME, Boolean.class, PlayVideoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SendActionResult", scope = SendActionResponse.class)
    public JAXBElement<Boolean> createSendActionResponseSendActionResult(Boolean value) {
        return new JAXBElement<Boolean>(_SendActionResponseSendActionResult_QNAME, Boolean.class, SendActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetContextListResult", scope = GetContextListResponse.class)
    public JAXBElement<ArrayOfString> createGetContextListResponseGetContextListResult(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetContextListResponseGetContextListResult_QNAME, ArrayOfString.class, GetContextListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Message", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationMessage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationMessage_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Timeout", scope = SendNotification.class)
    public JAXBElement<Integer> createSendNotificationTimeout(Integer value) {
        return new JAXBElement<Integer>(_SendNotificationTimeout_QNAME, Integer.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Priority", scope = SendNotification.class)
    public JAXBElement<Long> createSendNotificationPriority(Long value) {
        return new JAXBElement<Long>(_SendNotificationPriority_QNAME, Long.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Origin", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationOrigin(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationOrigin_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Progress", scope = SendNotification.class)
    public JAXBElement<Float> createSendNotificationProgress(Float value) {
        return new JAXBElement<Float>(_SendNotificationProgress_QNAME, Float.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Description", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationDescription(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationDescription_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Image", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationImage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationImage_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Error", scope = SendNotification.class)
    public JAXBElement<Boolean> createSendNotificationError(Boolean value) {
        return new JAXBElement<Boolean>(_SendNotificationError_QNAME, Boolean.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ProgressText", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationProgressText(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationProgressText_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Extra", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationExtra(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationExtra_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Type", scope = SendNotification.class)
    public JAXBElement<java.lang.String> createSendNotificationType(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationType_QNAME, java.lang.String.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Fullscreen", scope = SendNotification.class)
    public JAXBElement<Boolean> createSendNotificationFullscreen(Boolean value) {
        return new JAXBElement<Boolean>(_SendNotificationFullscreen_QNAME, Boolean.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Visibility", scope = SendNotification.class)
    public JAXBElement<Long> createSendNotificationVisibility(Long value) {
        return new JAXBElement<Long>(_SendNotificationVisibility_QNAME, Long.class, SendNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "PlayRecordingResult", scope = PlayRecordingResponse.class)
    public JAXBElement<Boolean> createPlayRecordingResponsePlayRecordingResult(Boolean value) {
        return new JAXBElement<Boolean>(_PlayRecordingResponsePlayRecordingResult_QNAME, Boolean.class, PlayRecordingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Context", scope = GetActionList.class)
    public JAXBElement<java.lang.String> createGetActionListContext(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_GetActionListContext_QNAME, java.lang.String.class, GetActionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Key", scope = SendKey.class)
    public JAXBElement<java.lang.String> createSendKeyKey(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendKeyKey_QNAME, java.lang.String.class, SendKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SendMessageResult", scope = SendMessageResponse.class)
    public JAXBElement<Boolean> createSendMessageResponseSendMessageResult(Boolean value) {
        return new JAXBElement<Boolean>(_SendMessageResponseSendMessageResult_QNAME, Boolean.class, SendMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrontendActionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetActionListResult", scope = GetActionListResponse.class)
    public JAXBElement<FrontendActionList> createGetActionListResponseGetActionListResult(FrontendActionList value) {
        return new JAXBElement<FrontendActionList>(_GetActionListResponseGetActionListResult_QNAME, FrontendActionList.class, GetActionListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SendNotificationResult", scope = SendNotificationResponse.class)
    public JAXBElement<Boolean> createSendNotificationResponseSendNotificationResult(Boolean value) {
        return new JAXBElement<Boolean>(_SendNotificationResponseSendNotificationResult_QNAME, Boolean.class, SendNotificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Message", scope = SendMessage.class)
    public JAXBElement<java.lang.String> createSendMessageMessage(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_SendNotificationMessage_QNAME, java.lang.String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Timeout", scope = SendMessage.class)
    public JAXBElement<Long> createSendMessageTimeout(Long value) {
        return new JAXBElement<Long>(_SendNotificationTimeout_QNAME, Long.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrontendStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "GetStatusResult", scope = GetStatusResponse.class)
    public JAXBElement<FrontendStatus> createGetStatusResponseGetStatusResult(FrontendStatus value) {
        return new JAXBElement<FrontendStatus>(_GetStatusResponseGetStatusResult_QNAME, FrontendStatus.class, GetStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "SendKeyResult", scope = SendKeyResponse.class)
    public JAXBElement<Boolean> createSendKeyResponseSendKeyResult(Boolean value) {
        return new JAXBElement<Boolean>(_SendKeyResponseSendKeyResult_QNAME, Boolean.class, SendKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "ChanId", scope = PlayRecording.class)
    public JAXBElement<Integer> createPlayRecordingChanId(Integer value) {
        return new JAXBElement<Integer>(_PlayRecordingChanId_QNAME, Integer.class, PlayRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "RecordedId", scope = PlayRecording.class)
    public JAXBElement<Integer> createPlayRecordingRecordedId(Integer value) {
        return new JAXBElement<Integer>(_PlayRecordingRecordedId_QNAME, Integer.class, PlayRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "StartTime", scope = PlayRecording.class)
    public JAXBElement<XMLGregorianCalendar> createPlayRecordingStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PlayRecordingStartTime_QNAME, XMLGregorianCalendar.class, PlayRecording.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "UseBookmark", scope = PlayVideo.class)
    public JAXBElement<Boolean> createPlayVideoUseBookmark(Boolean value) {
        return new JAXBElement<Boolean>(_PlayVideoUseBookmark_QNAME, Boolean.class, PlayVideo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mythtv.org", name = "Id", scope = PlayVideo.class)
    public JAXBElement<java.lang.String> createPlayVideoId(java.lang.String value) {
        return new JAXBElement<java.lang.String>(_PlayVideoId_QNAME, java.lang.String.class, PlayVideo.class, value);
    }

}
