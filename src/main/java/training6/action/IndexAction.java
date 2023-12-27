/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package training6.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import training6.service.CsvService;

/**
 * 最初の画面に遷移するアクションです
 * @author e_kumakiri
 *
 */
public class IndexAction {

	@Resource
	protected CsvService csvService;
	/**
	 * 最初の画面に遷移するメソッドです
	 * @return 最初の画面
	 */
	@Execute(validator=false)
	public String index() {
        return "index.jsp";
		  }
}

