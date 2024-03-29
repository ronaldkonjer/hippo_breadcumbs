/*
 * Copyright 2009-2013 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onehippo.forge.breadcrumb.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

/**
 * Standard HST Breadcrumb component.
 */
public class BreadcrumbComponent extends BaseHstComponent {

    private final BreadcrumbProvider breadcrumbProvider = new BreadcrumbProvider(this);

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response)
            throws HstComponentException {
        super.doBeforeRender(request, response);

        request.setAttribute(BreadcrumbProvider.ATTRIBUTE_NAME, breadcrumbProvider.getBreadcrumb(request));
    }
}
