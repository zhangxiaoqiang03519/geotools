/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import java.math.BigInteger;

import java.util.Map;

import net.opengis.fes20.AbstractQueryExpressionType;

import net.opengis.wfs20.ResolveValueType;
import net.opengis.wfs20.ResultTypeType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link net.opengis.wfs20.GetFeatureType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GetFeatureTypeValidator {
  boolean validate();

  boolean validateCount(BigInteger value);
  boolean validateOutputFormat(String value);
  boolean validateResolve(ResolveValueType value);
  boolean validateResolveDepth(Object value);
  boolean validateResolveTimeout(BigInteger value);
  boolean validateResultType(ResultTypeType value);
  boolean validateStartIndex(BigInteger value);
  boolean validateMetadata(Map value);
  boolean validateFormatOptions(Map value);
  boolean validateViewParams(EList<Map> value);
  boolean validateAbstractQueryExpressionGroup(FeatureMap value);
  boolean validateAbstractQueryExpression(EList<AbstractQueryExpressionType> value);
}