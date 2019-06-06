/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import javax.xml.namespace.QName;

import net.opengis.ows11.KeywordsType;
import net.opengis.ows11.WGS84BoundingBoxType;

import net.opengis.wfs20.AbstractType;
import net.opengis.wfs20.ExtendedDescriptionType;
import net.opengis.wfs20.MetadataURLType;
import net.opengis.wfs20.NoCRSType;
import net.opengis.wfs20.OutputFormatListType;
import net.opengis.wfs20.TitleType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.opengis.wfs20.FeatureTypeType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureTypeTypeValidator {
  boolean validate();

  boolean validateName(QName value);
  boolean validateTitle(EList<TitleType> value);
  boolean validateAbstract(EList<AbstractType> value);
  boolean validateKeywords(EList<KeywordsType> value);
  boolean validateDefaultCRS(String value);
  boolean validateOtherCRS(EList<String> value);

  boolean validateOtherCRS(String value);
  boolean validateNoCRS(NoCRSType value);
  boolean validateOutputFormats(EList<OutputFormatListType> value);

  boolean validateOutputFormats(OutputFormatListType value);
  boolean validateWGS84BoundingBox(EList<WGS84BoundingBoxType> value);
  boolean validateMetadataURL(EList<MetadataURLType> value);
  boolean validateExtendedDescription(ExtendedDescriptionType value);
}