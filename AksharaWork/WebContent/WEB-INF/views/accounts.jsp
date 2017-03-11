<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="hold-transition skin-blue sidebar-mini">
  <div class="wrapper">
   <form class="form-horizontal" method="post">
      <div class="content-wrapper">
       <section class="content-header">
         <h1>
            Free Mind Services<small>Working</small>
         </h1>
         <ol class="breadcrumb">
           <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
           <li class="active">Here</li>
         </ol>
       </section>
       <section class="content">
          <!-- Custom Tabs -->
         <div class="nav-tabs-custom">
           <ul class="nav nav-tabs">
            <li class="active"><a href="#general_info" data-toggle="tab">Accounts</a></li>
            <li class="tabs"  style="display:none"  id="education_tab"><a href="#education" data-toggle="tab">Education</a></li>
            <li class="tabs"  style="display:none"  id="certification_tab"><a href="#certification" data-toggle="tab">Certifications</a></li>
            <li class="tabs"  style="display:none"  id="experience_tab"><a href="#experience" data-toggle="tab">Experience</a></li>
            <li class="tabs"  style="display:none" id="personal_tab" ><a href="#personel_details" data-toggle="tab">Personal Details</a></li>
            <li class="dropdown tabs"  style="display:none" id="family_tab" > <a class="dropdown-toggle" data-toggle="dropdown" href="#">Family Details<span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#father_info" data-toggle="tab">Father Info</a></li>
                <li><a href="#mother_info" data-toggle="tab">Mother Info</a></li>
                <li><a href="#partner_info" data-toggle="tab">Partner Info</a></li>
                <li><a href="#children_info" data-toggle="tab">Children Info</a></li>
                <li><a href="#siblings_info" data-toggle="tab">Siblings Info</a></li>
              </ul>
            </li>
            <li class="pull-right"><a href="#" class="text-muted"><i class="fa fa-gear"></i></a></li>
          </ul>
          <div class="tab-content">
            <div class="tab-pane active" id="general_info">
                <div class="box-body">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Account ID <span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="Account ID" name="emp_uid" id="emp_uid" value="" onKeyUp="existedEmp(this.value)">
                      <span class="required" id="exist_show"></span>
                    </div>
                    <label class="col-sm-2 control-label">Account Type<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <select class="form-control" name="designation_id" id="designation_id">
                        <option value="">Select Account Type</option>
                        <option value="">Other Value</option>
                       </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Account Name <span class="required">*</span></label>
                    <div class="col-sm-8">
                      <input type="text" class="form-control" placeholder="Account Name" name="emp_name" id="emp_name" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Contact Person<span class="required">*</span></label>
                    <div class="col-sm-8">
                      <input class="form-control"  id="emp_contact_no" type="text" name="emp_contact_no" placeholder="Contact No" value=""/>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">House No/Do No.<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="House No/DO No" name="emp_uid" id="emp_uid" value="" onKeyUp="existedEmp(this.value)">
                      <span class="required" id="exist_show"></span>
                    </div>
                    <label class="col-sm-2 control-label">Street Name:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="Street Name" name="emp_uid" id="emp_uid" value="" onKeyUp="existedEmp(this.value)">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Area<span class="required">*</span></label>
                    <div class="col-sm-8">
                      <input class="form-control"  id="emp_contact_no" type="text" name="emp_contact_no" placeholder="Area" value=""/>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">City/District<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="City/District" name="emp_uid" id="emp_uid" value="" onKeyUp="existedEmp(this.value)">
                    </div>
                    <label class="col-sm-2 control-label">Pin code:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <select class="form-control" name="designation_id" id="designation_id">
                        <option value="">Select Account Type</option>
                        <option value="">Other Value</option>
                       </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Route code:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <select class="form-control" name="designation_id" id="designation_id">
                        <option value="">Select Route Code</option>
                        <option value="">Other Value</option>
                       </select>
                    </div> 
                    <label class="col-sm-2 control-label">District code:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <select class="form-control" name="designation_id" id="designation_id">
                        <option value="">Select District Code</option>
                        <option value="">Other Value</option>
                       </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">State <span class="required">*</span></label>
                    <div class="col-sm-8">
                      <select class="form-control" name="state_id" id="state_id" onChange="getDistricts(this.value)">
                        <option value="3">Select State</option>
                                                <option value="1" >AP</option>
                                                <option value="2" >TS</option>
                                              </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Country/Region<span class="required">*</span></label>
                    <div class="col-sm-8">
                      <select class="form-control" name="country" id="country" >
                        <option value="3">Select Country</option>
                                                <option value="1" >India</option>
                                                <option value="2" >USA</option>
                                              </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Phone:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="Phone" name="phone">
                    </div> 
                    <label class="col-sm-2 control-label">Phone Type:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <select class="form-control" name="designation_id" id="designation_id">
                        <option value="">Select Phone Type</option>
                        <option value="">Other Value</option>
                       </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Email:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="Email" name="phone">
                    </div> 
                    <label class="col-sm-2 control-label">Email Type:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <select class="form-control" name="designation_id" id="designation_id">
                        <option value="">Select Email Type</option>
                        <option value="">Other Value</option>
                       </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">APGST No.<span class="required">*</span></label>
                    <div class="col-sm-8" >
                       <input type="email" class="form-control" placeholder="APGST No." name="district" id="district" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">CST No.<span class="required">*</span></label>
                    <div class="col-sm-8" >
                       <input type="email" class="form-control" placeholder="CST No." name="district" id="district" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">PAN No.<span class="required">*</span></label>
                    <div class="col-sm-8" >
                       <input type="email" class="form-control" placeholder="PAN No." name="district" id="district" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">VAT No.<span class="required">*</span></label>
                    <div class="col-sm-8" >
                       <input type="email" class="form-control" placeholder="VAT No." name="district" id="district" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">TIN No.<span class="required">*</span></label>
                    <div class="col-sm-8" >
                       <input type="email" class="form-control" placeholder="TIN No." name="district" id="district" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">PL No.<span class="required">*</span></label>
                    <div class="col-sm-8" >
                       <input type="email" class="form-control" placeholder="PL No." name="district" id="district" value="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Credit Limit:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="Credit Limit" name="phone">
                    </div> 
                    <label class="col-sm-2 control-label">Credit  Days:<span class="required">*</span></label>
                    <div class="col-sm-3">
                      <input type="text" class="form-control" placeholder="Credit Days">
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-3">
                      <input type="reset" class="btn btn-danger pull-right" value="cancel">
                    </div> 
                    <div class="col-sm-3">
                      <input type="submit" class="btn btn-success" value="save">
                    </div>
                  </div>
                </div>
                </div>
                </div>
             </div>
      </section>
    </div>
   </form>
 </div>
</body>
</html>