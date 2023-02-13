import React, { Component } from 'react';
import SingleContact from './SingleContact';
import AddContacts from './AddContacts';

export default class Contacts extends Component{
    
    constructor(props) {

        super(props);
        this.state = {
            contact : [],
        };
    }

    componentDidMount(){
        fetch('http://localhost:8090/api/contacts')
        .then(response => response.json)
        .then(data => this.setState({contact : data}))
    } 
    
    render() {
        return (
            <div>
                <div className="row">
                    <AddContacts />
                </div>
                <div className="row">
                        {this.state.contact.map( item => (
                            <SingleContact key={item.id} item={item} />
                        ))}
                </div>                        
            </div>
        )
    }
}

