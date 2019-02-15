/*
 * Copyright 2019 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package views

import controllers.routes
import models.Claimant.You
import views.behaviours.ViewBehaviours
import views.html.notEntitledSomeYears

class NotEntitledSomeYearsViewSpec extends ViewBehaviours {

  val onwardRoute = routes.IndexController.onPageLoad()

  val claimant = You

  val messageKeyPrefix = s"notEntitledSomeYears.$claimant"

  def createView = () => notEntitledSomeYears(frontendAppConfig, claimant, onwardRoute)(fakeRequest, messages)

  "NotEntitledSomeYears view" must {
    behave like normalPage(createView, messageKeyPrefix)

    behave like pageWithBackLink(createView)
  }
}
