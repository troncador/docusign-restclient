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
package uk.co.techblue.docusign.client.exception;

/**
 * The Class EnvelopeException.
 */
public class EnvelopeException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2855659560862235139L;

    /**
     * Instantiates a new envelope exception.
     * 
     * @param message
     *            the message
     */
    public EnvelopeException(String message) {
        super(message);
    }

    /**
     * Instantiates a new envelope exception.
     * 
     * @param throwable
     *            the throwable
     */
    public EnvelopeException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new envelope exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public EnvelopeException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
