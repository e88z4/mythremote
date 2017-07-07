
package mythapi.frontend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrontendStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrontendStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://mythtv.org}MapOfStringString" minOccurs="0"/>
 *         &lt;element name="ChapterTimes" type="{http://mythtv.org}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="SubtitleTracks" type="{http://mythtv.org}MapOfStringTrack" minOccurs="0"/>
 *         &lt;element name="AudioTracks" type="{http://mythtv.org}MapOfStringTrack" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrontendStatus", propOrder = {
    "name",
    "version",
    "state",
    "chapterTimes",
    "subtitleTracks",
    "audioTracks"
})
public class FrontendStatus {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "State")
    protected MapOfStringString state;
    @XmlElement(name = "ChapterTimes")
    protected ArrayOfString chapterTimes;
    @XmlElement(name = "SubtitleTracks")
    protected MapOfStringTrack subtitleTracks;
    @XmlElement(name = "AudioTracks")
    protected MapOfStringTrack audioTracks;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link MapOfStringString }
     *     
     */
    public MapOfStringString getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapOfStringString }
     *     
     */
    public void setState(MapOfStringString value) {
        this.state = value;
    }

    /**
     * Gets the value of the chapterTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getChapterTimes() {
        return chapterTimes;
    }

    /**
     * Sets the value of the chapterTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setChapterTimes(ArrayOfString value) {
        this.chapterTimes = value;
    }

    /**
     * Gets the value of the subtitleTracks property.
     * 
     * @return
     *     possible object is
     *     {@link MapOfStringTrack }
     *     
     */
    public MapOfStringTrack getSubtitleTracks() {
        return subtitleTracks;
    }

    /**
     * Sets the value of the subtitleTracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapOfStringTrack }
     *     
     */
    public void setSubtitleTracks(MapOfStringTrack value) {
        this.subtitleTracks = value;
    }

    /**
     * Gets the value of the audioTracks property.
     * 
     * @return
     *     possible object is
     *     {@link MapOfStringTrack }
     *     
     */
    public MapOfStringTrack getAudioTracks() {
        return audioTracks;
    }

    /**
     * Sets the value of the audioTracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapOfStringTrack }
     *     
     */
    public void setAudioTracks(MapOfStringTrack value) {
        this.audioTracks = value;
    }

}
