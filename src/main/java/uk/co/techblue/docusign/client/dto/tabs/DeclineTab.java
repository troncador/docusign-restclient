/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.envelope.attributes.Font;
import uk.co.techblue.docusign.client.envelope.attributes.FontColor;
import uk.co.techblue.docusign.client.envelope.attributes.FontSize;

/**
 * Place this tag on the document where you want to give the recipient the
 * option of declining an envelope. If the recipient clicks the Decline tag
 * during the signing process, the envelope is voided.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class DeclineTab extends Tab {

	/** The conditional parent label. */
	@JsonProperty
	private String conditionalParentLabel;

	/** The conditional parent value. */
	@JsonProperty
	private String conditionalParentValue;

	/** The recipient id. */
	@JsonProperty
	private String recipientId;

	/** The template locked. */
	@JsonProperty
	private Boolean templateLocked;

	/** The template required. */
	@JsonProperty
	private Boolean templateRequired;

	/** The bold. */
	@JsonProperty
	private Boolean bold;

	/** The font. */
	@JsonProperty
	private Font font;

	/** The font color. */
	@JsonProperty
	private FontColor fontColor;

	/** The font size. */
	@JsonProperty
	private FontSize fontSize;

	/** The italic. */
	@JsonProperty
	private Boolean italic;

	/** The underline. */
	@JsonProperty
	private Boolean underline;

	/** The button text. */
	@JsonProperty
	private String buttonText;

	/** The width. */
	@JsonProperty
	private Integer width;

	/** The height. */
	@JsonProperty
	private Integer height;

	/**
	 * Gets the conditional parent label.
	 * 
	 * @return the conditional parent label
	 */
	public String getConditionalParentLabel() {
		return conditionalParentLabel;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the conditional parent label. For conditional fields this is the
	 * TabLabel of the parent tab that controls this tab’s visibility.
	 * 
	 * 
	 * @param conditionalParentLabel
	 *            the new conditional parent label
	 */
	public void setConditionalParentLabel(String conditionalParentLabel) {
		this.conditionalParentLabel = conditionalParentLabel;
	}

	/**
	 * Gets the conditional parent value.
	 * 
	 * @return the conditional parent value
	 */
	public String getConditionalParentValue() {
		return conditionalParentValue;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the conditional parent value. For conditional fields this is the
	 * Value of the parent tab that controls this tab’s visibility.
	 * 
	 * 
	 * @param conditionalParentValue
	 *            the new conditional parent value
	 */
	public void setConditionalParentValue(String conditionalParentValue) {
		this.conditionalParentValue = conditionalParentValue;
	}

	/**
	 * Gets the recipient id.
	 * 
	 * @return the recipient id
	 */
	public String getRecipientId() {
		return recipientId;
	}

	/**
	 * Sets the recipient id. This specifies the recipient associated with the
	 * tab. Must refer to an existing recipient’s ID attribute.
	 * 
	 * 
	 * @param recipientId
	 *            the new recipient id
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	/**
	 * Gets the template locked.
	 * 
	 * @return the template locked
	 */
	public Boolean getTemplateLocked() {
		return templateLocked;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the template locked. Used only when working with template tabs. If
	 * true, the attributes of the tab cannot be changed by the sender.
	 * 
	 * 
	 * @param templateLocked
	 *            the new template locked
	 */
	public void setTemplateLocked(Boolean templateLocked) {
		this.templateLocked = templateLocked;
	}

	/**
	 * Gets the template required.
	 * 
	 * @return the template required
	 */
	public Boolean getTemplateRequired() {
		return templateRequired;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the template required. Used only when working with template tabs. If
	 * true, the tab cannot be removed by the sender.
	 * 
	 * 
	 * @param templateRequired
	 *            the new template required
	 */
	public void setTemplateRequired(Boolean templateRequired) {
		this.templateRequired = templateRequired;
	}

	/**
	 * Gets the bold.
	 * 
	 * @return the bold
	 */
	public Boolean getBold() {
		return bold;
	}

	/**
	 * If true, the information in the tab is bold.
	 * 
	 * @param bold
	 *            the new bold
	 */
	public void setBold(Boolean bold) {
		this.bold = bold;
	}

	/**
	 * Gets the font.
	 * 
	 * @return the font
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * Sets the font type used for the information in the tab.
	 * 
	 * 
	 * @param font
	 *            the font
	 */
	public void setFont(Font font) {
		this.font = font;
	}

	/**
	 * Gets the font color.
	 * 
	 * @return the font color
	 */
	public FontColor getFontColor() {
		return fontColor;
	}

	/**
	 * Sets the font color used for the information in the tab .
	 * 
	 * @param fontColor
	 *            the new font color
	 */
	public void setFontColor(FontColor fontColor) {
		this.fontColor = fontColor;
	}

	/**
	 * Gets the font size.
	 * 
	 * @return the font size
	 */
	public FontSize getFontSize() {
		return fontSize;
	}

	/**
	 * Sets the font size used for the information in the tab.
	 * 
	 * 
	 * @param fontSize
	 *            the new font size
	 */
	public void setFontSize(FontSize fontSize) {
		this.fontSize = fontSize;
	}

	/**
	 * Gets the italic.
	 * 
	 * @return the italic
	 */
	public Boolean getItalic() {
		return italic;
	}

	/**
	 * If true, the information in the tab is italic.
	 * 
	 * 
	 * @param italic
	 *            the new italic
	 */
	public void setItalic(Boolean italic) {
		this.italic = italic;
	}

	/**
	 * Gets the underline.
	 * 
	 * @return the underline
	 */
	public Boolean getUnderline() {
		return underline;
	}

	/**
	 * If true, the information in the tab is underlined.
	 * 
	 * 
	 * @param underline
	 *            the new underline
	 */
	public void setUnderline(Boolean underline) {
		this.underline = underline;
	}

	/**
	 * Gets the button text.
	 * 
	 * @return the button text
	 */
	public String getButtonText() {
		return buttonText;
	}

	/**
	 * Sets the button text. The text displayed in the tab. Only used in
	 * approveTabs and declineTabs.
	 * 
	 * 
	 * @param buttonText
	 *            the new button text
	 */
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * Sets the width of the tab.
	 * 
	 * @param width
	 *            the new width
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * Sets the height of the tab.
	 * 
	 * @param height
	 *            the new height
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
}