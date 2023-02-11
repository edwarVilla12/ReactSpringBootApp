import React from 'react';

const SingleContact = ({item}) => (
    <div classNameName="row">
    <div classNameName="col s12 m6">
      <div classNameName="card blue-grey darken-1">
        <div classNameName="card-content white-text">
          <span classNameName="card-title">{item.firstName} {item.lastName}</span>           
        </div>
        <div classNameName="card-action">
          <p>{item.email}</p>
        </div>
      </div>
    </div>
  </div>            
);

export default SingleContact;