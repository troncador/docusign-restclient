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
package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class EnvelopeDocumentInfo.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeDocumentInfo extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1717401378166965662L;

	/** The envelope id. */
	@JsonProperty
	private String envelopeId;

	/** The envelope documents. */
	@JsonProperty
	private List<EnvelopeDocument> envelopeDocuments;

	/**
	 * Gets the envelope id.
	 *
	 * @return the envelope id
	 */
	public String getEnvelopeId() {
		return envelopeId;
	}

	/**
	 * Sets the envelope id.
	 *
	 * @param envelopeId the new envelope id
	 */
	public void setEnvelopeId(String envelopeId) {
		this.envelopeId = envelopeId;
	}

	/**
	 * Gets the envelope documents.
	 *
	 * @return the envelope documents
	 */
	public List<EnvelopeDocument> getEnvelopeDocuments() {
		return envelopeDocuments;
	}

	/**
	 * Sets the envelope documents.
	 *
	 * @param envelopeDocuments the new envelope documents
	 */
	public void setEnvelopeDocuments(List<EnvelopeDocument> envelopeDocuments) {
		this.envelopeDocuments = envelopeDocuments;
	}
}
