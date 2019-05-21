/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Information about a product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p5beta1ProductSearchResultsResult extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the image from the product that is the closest match to the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String image;

  /**
   * The Product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p5beta1Product product;

  /**
   * A confidence level on the match, ranging from 0 (no confidence) to 1 (full confidence).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * The resource name of the image from the product that is the closest match to the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getImage() {
    return image;
  }

  /**
   * The resource name of the image from the product that is the closest match to the query.
   * @param image image or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1ProductSearchResultsResult setImage(java.lang.String image) {
    this.image = image;
    return this;
  }

  /**
   * The Product.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1Product getProduct() {
    return product;
  }

  /**
   * The Product.
   * @param product product or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1ProductSearchResultsResult setProduct(GoogleCloudVisionV1p5beta1Product product) {
    this.product = product;
    return this;
  }

  /**
   * A confidence level on the match, ranging from 0 (no confidence) to 1 (full confidence).
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * A confidence level on the match, ranging from 0 (no confidence) to 1 (full confidence).
   * @param score score or {@code null} for none
   */
  public GoogleCloudVisionV1p5beta1ProductSearchResultsResult setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p5beta1ProductSearchResultsResult set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p5beta1ProductSearchResultsResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p5beta1ProductSearchResultsResult clone() {
    return (GoogleCloudVisionV1p5beta1ProductSearchResultsResult) super.clone();
  }

}
